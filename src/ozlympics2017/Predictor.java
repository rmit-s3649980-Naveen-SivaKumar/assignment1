package ozlympics2017;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Predictor {

	/**
	 * @param args
	 * @throws IOException
	 */
	public HashMap<Integer, String> predict(int j) throws IOException {
		Atheletes atheletes = new DataPopulator().dataPopulate();
		HashMap<Integer, String> winners = new HashMap<Integer, String>();
		if (j == 1) {
			List<String> swimmers = atheletes.getSwimmers();
			Collections.shuffle(swimmers);

			for (int i = 0; i < 5; i++) {
				winners.put(i + 1, swimmers.get(i));
			}
		} else if (j == 2) {
			List<String> runners = atheletes.getRunners();
			Collections.shuffle(runners);
			for (int i = 0; i < 5; i++) {
				winners.put(i + 1, runners.get(i));
			}
		} 

		return winners;
	}

}
