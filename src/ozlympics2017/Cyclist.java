//author: s3538338
package ozlympics2017;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Cyclist implements Game{
	public void cyclingWinner(HashMap<Integer, String> winnersListCycling) {
		int i=0;
		System.out.println("Winners in Cycling\n");
		ArrayList<Double> time = compete();
		System.out
				.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %30s", "Place", "NAME", "Time");
		System.out.println();
		System.out
				.println("-----------------------------------------------------------------------------");
		for (HashMap.Entry<Integer, String> entry : winnersListCycling
				.entrySet()) {
			System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),time.get(i)+"m");
			i++;
			System.out.println();
		}
		System.out
				.println("-----------------------------------------------------------------------------");
	}

	public ArrayList<Double> compete(){
		DecimalFormat formatter = new DecimalFormat("00.000");
		ArrayList <Double> correctTime= new ArrayList<Double>();
		HashSet<Double> time= new HashSet<Double>();
		double range=(799-500)+1;
		while(time.size()<6){
			time.add((Double.parseDouble(formatter.format(((Math.random()*range)+500)/60))));
		}
		correctTime.addAll(time);
		Collections.sort(correctTime);
		return correctTime;
	}
}
