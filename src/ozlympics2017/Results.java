package ozlympics2017;

import java.io.IOException;
import java.util.HashMap;

public class Results {
	public void getResult(HashMap<Integer, String> winnersListSwimming,HashMap<Integer, String> winnersListRunning,HashMap<Integer, String> winnersListCycling,HashMap<Integer, String> winnersListTriathlon) throws IOException {
		
		
		new Swimmer().swimmerWinner(winnersListSwimming);
		new Runner().runnerWinner(winnersListRunning);
		new Cyclist().cyclingWinner(winnersListCycling);
		new Triathlon().triathlonWinner(winnersListTriathlon);
		
		System.out.println("\n");
	}
	
}
