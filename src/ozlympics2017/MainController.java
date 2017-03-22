package ozlympics2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userOption;
		int mainOption;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		List<String> userSelectionList= new ArrayList<String>();
		List<HashMap<Integer, String>> winnersListSwimming = new ArrayList<HashMap<Integer,String>>();
		List<HashMap<Integer, String>> winnersListRunning = new ArrayList<HashMap<Integer,String>>();
		List<HashMap<Integer, String>> winnersListCycling = new ArrayList<HashMap<Integer,String>>();

		
		while(!exit){
			mainOption = mainMethod();
		switch (mainOption){
		case 1:{
			System.out.println("Select one of the three games for prediction.");
			System.out.println("1. Swimming");
			System.out.println("2. Running");
			System.out.println("3. Cycling");
			
			System.out.println("\n");
			break;
		}
		case 2:{
			System.out.println("Select one of the three games for prediction.");
			System.out.println("1. Swimming");
			System.out.println("2. Running");
			System.out.println("3. Cycling");
			ArrayList<List<String>> participants = new ArrayList<List<String>>();
			List<String> userList= new ArrayList<String>();
			DataPopulator AP = new DataPopulator();
			participants=new DataPopulator().dataPopulate();
			userOption=sc.nextInt()-1;
			userList=participants.get(userOption);
			
			for(int i=0; i<userList.size(); i++){
				System.out.println((i+1)+". "+userList.get(i));
			}
			System.out.println("\n");
			break;
		}
			
		case 3:{
			System.out.println("Select one of the three games.");
			System.out.println("1. Swimming");
			System.out.println("2. Running");
			System.out.println("3. Cycling");
			/*Predictor predictor = new Predictor();
			winnersList=predictor.predict(sc.nextInt());
			System.out.println(winnersList);*/
			System.out.println("Game Started");
			System.out.println("------------------------------------------");
			System.out.println("Game Completed!! Please check the results in results page");
			System.out.println("\n");
			break;
		}
		case 4:{
			Predictor predictor = new Predictor();
			winnersListSwimming=predictor.predict(1);
			winnersListRunning=predictor.predict(2);
			winnersListCycling=predictor.predict(3);
			System.out.println("Winners in Swimming"+"\n"+ winnersListSwimming);
			System.out.println("Winners in Running"+"\n"+winnersListRunning);
			System.out.println("Winners in Cycling"+"\n"+winnersListCycling);
			System.out.println("\n");
			break;
		}
			
		case 5:{
			System.out.println("5. Display the points of all athletes");
			System.out.println("\n");
			break;
		}
		case 6:{
			System.out.println("Have a Great Day!!!! Bye!!");
			exit=true;
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
