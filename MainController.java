
package ozlympics2017;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int userOption;
		int mainOption;
		int userPoints = 0;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		List<String> userSelectionList= new ArrayList<String>();
		Atheletes atheletes = new Atheletes();
		Results results= new Results();
		HashMap<Integer, String>winnersListSwimming = new HashMap<Integer,String>();
		HashMap<Integer, String> winnersListRunning = new HashMap<Integer,String>();
		HashMap<Integer, String> winnersListCycling = new HashMap<Integer,String>();
		HashMap<Integer, String> winnersListTriathlon = new HashMap<Integer,String>();
		HashMap<String,Integer> atheletePoint = new HashMap<String,Integer>();
		
		while(!exit){
			mainOption = mainMethod();
		switch (mainOption){
		case 1:{
			System.out.println("Select one of the three games for prediction.");
			System.out.println("1. Swimming");
			System.out.println("2. Running");
			System.out.println("3. Cycling");
			System.out.println("4. Triathlon");
			DataPopulator AP = new DataPopulator();
			userOption=sc.nextInt();
			switch(userOption){
			case 1:{
				userSelectionList.add("Swimming");
				atheletes= AP.dataPopulate();
				System.out.println("The game you have selected is Swimming");
				break;
			}
			case 2:{
				userSelectionList.add("Running");
				atheletes= AP.dataPopulate();
				System.out.println("The game you have selected is Running");
				break;
			}
			case 3:{
				userSelectionList.add("Cycling");
				atheletes= AP.dataPopulate();
				System.out.println("The game you have selected is Cycling");
				break;
			}
			case 4:{
				userSelectionList.add("Triathlon");
				atheletes= AP.dataPopulate();
				System.out.println("The game you have selected is Triathlon");
				break;
			}
			default :{
				System.out.println("Invalid selection");
				break;
			}
			}
			
			/*System.out.println(atheletes.getRunners());
			System.out.println(atheletes.getSwimmers());
			System.out.println(atheletes.getCyclist());
			System.out.println(atheletes.getSuperAthelete());
			System.out.println(atheletes.getRunnersReferee());
			System.out.println(atheletes.getSwimmersReferee());
			System.out.println(atheletes.getCyclistReferee());
			System.out.println(atheletes.getSuperAtheleteReferee());*/
			System.out.println("\n");
			break;
		}
		case 2:{
			
			ArrayList<List<String>> participants = new ArrayList<List<String>>();
			List<String> userList= new ArrayList<String>();
			if( userSelectionList.size()!=0){
				System.out.println("Predict the winner");
				switch(userSelectionList.get(0)){
				case "Swimming":{
					userList.addAll(atheletes.getSwimmers());
					for(int i=0; i<userList.size(); i++){
						System.out.println((i+1)+". "+userList.get(i));
					}
					System.out.println("\nSelect the player:");
					int selected= sc.nextInt();
					if(selected>0 && selected<6){
					userSelectionList.add(userList.get(selected-1));
					System.out.println(userSelectionList);
					}
					else
					{
						System.out.println("Invalid Selection Please try again");
						break;
					}
					break;
				}
				case "Running":{
					userList.addAll(atheletes.getRunners());
					for(int i=0; i<userList.size(); i++){
						System.out.println((i+1)+". "+userList.get(i));
					}
					System.out.println("\nSelect the player:");
					int selected= sc.nextInt();
					if(selected>0 && selected<6){
					userSelectionList.add(userList.get(selected-1));
					System.out.println(userSelectionList);
					}
					else
					{
						System.out.println("Invalid Selection Please try again");
						break;
					}
					break;
				}
				case "Cycling":{
					userList.addAll(atheletes.getCyclist());
					for(int i=0; i<userList.size(); i++){
						System.out.println((i+1)+". "+userList.get(i));
					}
					System.out.println("\n Select the player:");
					int selected= sc.nextInt();
					if(selected>0 && selected<6){
					userSelectionList.add(userList.get(selected-1));
					System.out.println(userSelectionList);
					}
					else
					{
						System.out.println("Invalid Selection Please try again");
						break;
					}
					break;
				}
				case "Triathlon":{
					userList.addAll(atheletes.getSuperAthelete());
					for(int i=0; i<userList.size(); i++){
						System.out.println((i+1)+". "+userList.get(i));
					}
					System.out.println("\n Select the player:");
					int selected= sc.nextInt();
					if(selected>0 && selected<6){
					userSelectionList.add(userList.get(selected-1));
					System.out.println(userSelectionList);
					}
					else
					{
						System.out.println("Invalid Selection Please try again");
						break;
					}
					break;
				}
				default:{
					System.out.println("Invalid Option");
					break;
				}
				}}
			else{
				System.out.println("Please select the game before predicting the winner");
			}
				
			
			break;
		}
			
		case 3:{
			System.out.println("Game Started");
			System.out.println("------------------------------------------");
			System.out.println("Game Completed!! Please check the results in results page");
			Predictor predictor = new Predictor();
			winnersListSwimming = predictor.predict(1);
			winnersListRunning = predictor.predict(2);
			winnersListCycling = predictor.predict(3);
			winnersListTriathlon= predictor.predict(4);
			System.out.println("\n");
			break;
		}
		case 4:{
			if(winnersListCycling.size()!=0){
			results.getResult(winnersListSwimming,winnersListRunning,winnersListCycling,winnersListTriathlon);
			break;
			}
			else{
				System.out.println("Please start the game first");
				break;
			}
		}
			
		case 5:{
			if(winnersListCycling.size()!=0){
			userPoints+=new AtheletePoints().getPoint(winnersListSwimming, winnersListCycling, winnersListRunning,winnersListTriathlon, userSelectionList);
			System.out.println("The total points earned by you is "+userPoints);
			userSelectionList.clear();
			break;
			}
			else{
				System.out.println("Please start the game first");
				break;
			}
		}
		case 6:{
			System.out.println("Have a Great Day!!!! Bye!!");
			exit=true;
		}
		default:{
			System.out.println("Invalid Option ");
		}
		}
		}
	}
	
	private static int mainMethod() {
		int selected;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Select the game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of the game");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
		selected=sc.nextInt();
		return selected;
	}
}
