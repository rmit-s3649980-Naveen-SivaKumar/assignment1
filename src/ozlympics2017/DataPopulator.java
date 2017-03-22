package ozlympics2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataPopulator {
	
	public ArrayList<List<String>> dataPopulate(){
		ArrayList<List<String>> atheletes = new ArrayList<List<String>>();
		List<String> runners = new ArrayList<String>();
		List<String> swimmers = new ArrayList<String>();
		List<String> cyclists = new ArrayList<String>();
		
		runners.add("runner1  72");
		runners.add("runner2  68");
		runners.add("runner3  54");
		runners.add("runner4  32");
		swimmers.add("swimmer1  41");
		swimmers.add("swimmer2  51");
		swimmers.add("swimmer3  36");
		swimmers.add("swimmer4  44");
		cyclists.add("cyclist1  65");
		cyclists.add("cyclist2  53");
		cyclists.add("cyclist3  62");
		cyclists.add("cyclist4  25");
		
		atheletes.add(swimmers);
		atheletes.add(runners);
		atheletes.add(cyclists);
		
		return atheletes;
	}
	
}
