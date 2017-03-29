package ozlympics2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Predictor {

	/**
	 * @param args
	 */
	/*
	 * ArrayList<HashMap<Integer, String>> atheletes = new
	 * ArrayList<HashMap<Integer,String>>(); atheletes=new
	 * DataPopulator().dataPopulate();
	 * 
	 * Random random = new Random(); HashMap<Integer, String> runners =
	 * atheletes.get(0); List <Integer> selector = new
	 * ArrayList<Integer>(runners.keySet()); HashMap<Integer, String> winners=
	 * new HashMap<Integer, String>(); for(int i=1; i<4; i++){ int a =
	 * selector.get(random.nextInt(runners.size()));
	 * System.out.println(runners.size()); System.out.println(runners.get(1));
	 * winners.put(i, runners.get(a)); runners.remove(a); }
	 * System.out.println(winners);
	 */
	public List<HashMap<Integer, String>> predict(int j) {
		Atheletes atheletes = new Atheletes();
		ArrayList<HashMap<Integer, String>> finalResult = new ArrayList<HashMap<Integer, String>>();

		if (j == 1) {
			List<String> swimmers = atheletes.getSwimmers();
			//List<Integer> selector = new ArrayList<Integer>(swimmers.keySet());
			Collections.shuffle(swimmers);
			HashMap<Integer, String> winners = new HashMap<Integer, String>();
			for (int i = 0; i < 4; i++) {
				//int a = selector.get(random.nextInt(swimmers.size()));
				/*System.out.println(runners.size());
				System.out.println(runners.get(1));*/
				winners.put(i+1, swimmers.get(i));
				//swimmers.remove(a);
			}
			finalResult.add(winners);
		} else if (j == 2) {
			List<String> runners = atheletes.getRunners();
			//List<Integer> selector = new ArrayList<Integer>(runners.keySet());
			Collections.shuffle(runners);
			HashMap<Integer, String> winners = new HashMap<Integer, String>();
			for (int i = 0; i < 4; i++) {
				//int a = selector.get(random.nextInt(runners.size()));
				/*System.out.println(runners.size());
				System.out.println(runners.get(1));*/
				winners.put(i+1, runners.get(i));
				//runners.remove(a);
			}
			finalResult.add(winners);
		} else if (j == 3) {
			List<String> cyclist = atheletes.getCyclist();
			//List<Integer> selector = new ArrayList<Integer>(cyclist.keySet());
			Collections.shuffle(cyclist);
			HashMap<Integer, String> winners = new HashMap<Integer, String>();
			for (int i = 0; i < 4; i++) {
				//int a = selector.get(random.nextInt(cyclist.size()));
				/*System.out.println(runners.size());
				System.out.println(runners.get(1));*/
				winners.put(i+1, cyclist.get(i));
				//cyclist.remove(a);
			}
		}
			 else if (j == 4) {
					List<String> superAthelete = atheletes.getSuperAthelete();
					//List<Integer> selector = new ArrayList<Integer>(cyclist.keySet());
					Collections.shuffle(superAthelete);
					HashMap<Integer, String> winners = new HashMap<Integer, String>();
					for (int i = 0; i < 4; i++) {
						//int a = selector.get(random.nextInt(cyclist.size()));
						/*System.out.println(runners.size());
						System.out.println(runners.get(1));*/
						winners.put(i+1, superAthelete.get(i));
						//cyclist.remove(a);
					}
			finalResult.add(winners);
		}
	
		return finalResult;
	}

}
