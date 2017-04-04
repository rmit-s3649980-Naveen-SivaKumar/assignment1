package ozlympics2017;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Triathlon implements Game{
	public void triathlonWinner(HashMap<Integer, String> winnersListTriathlon) {
		int i=0;
		System.out.println("Winners in Triathlon\n");
		ArrayList<Double> time = compete();
		System.out
				.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %30s %10s", "Place", "NAME", "Time");
		System.out.println();
		System.out
				.println("-----------------------------------------------------------------------------");
		for (HashMap.Entry<Integer, String> entry : winnersListTriathlon
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
		double range=(1999-1000)+1;
		while(time.size()<6){
			time.add((Double.parseDouble(formatter.format(((Math.random()*range)+1000)/60))));
		}
		correctTime.addAll(time);
		Collections.sort(correctTime);
		return correctTime;
	}
}
