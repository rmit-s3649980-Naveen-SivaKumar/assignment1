package ozlympics2017;

import java.util.HashMap;
import java.util.List;

public class AtheletePoints {
 public int getPoint(HashMap<Integer, String> winnersListSwimming,HashMap<Integer, String> winnersListCyclist,HashMap<Integer, String> winnersListRuning,HashMap<Integer, String>winnersListTriathlon,List<String> userSelectionList){
	 int userPoints = 0;
	 System.out.println("Winners in Swimming\n" );
		System.out
				.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %30s %10s", "Place", "NAME", "Points");
		System.out.println();
		System.out
				.println("-----------------------------------------------------------------------------");
		for (HashMap.Entry<Integer, String> entry :  winnersListSwimming
				.entrySet()) {
			if(entry.getKey()==1){
				if(userSelectionList.get(0).contentEquals("Swimming") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=10;
			System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),10);
			System.out.println();
			}
			else if(entry.getKey()==2){
				if(userSelectionList.get(0).contentEquals("Swimming") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=5;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),5);
				System.out.println();
				}
			else if(entry.getKey()==3){
				if(userSelectionList.get(0).contentEquals("Swimming") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=3;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),3);
				System.out.println();
				}
			else{
				if(userSelectionList.get(0).contentEquals("Swimming") && userSelectionList.get(1).contentEquals(entry.getValue()))
				userPoints=0;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),0);
				System.out.println();
				}
		}
		System.out
				.println("-----------------------------------------------------------------------------");
		System.out.println("Winners in Running\n" );
		System.out
				.println("-----------------------------------------------------------------------------");
		System.out.printf("%10s %30s %10s", "Place", "NAME", "Points");
		System.out.println();
		System.out
				.println("-----------------------------------------------------------------------------");
		for (HashMap.Entry<Integer, String> entry :  winnersListRuning
				.entrySet()) {
			if(entry.getKey()==1){
				if(userSelectionList.get(0).contentEquals("Running") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=10;
			System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),10);
			System.out.println();
			}
			else if(entry.getKey()==2){
				if(userSelectionList.get(0).contentEquals("Running") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=5;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),5);
				System.out.println();
				}
			else if(entry.getKey()==3){
				if(userSelectionList.get(0).contentEquals("Running") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=3;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),3);
				System.out.println();
				}
			else{
				if(userSelectionList.get(0).contentEquals("Running") && userSelectionList.get(1).contentEquals(entry.getValue()))
					userPoints=0;
				System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),0);
				System.out.println();
				}
		}
		System.out
		.println("-----------------------------------------------------------------------------");
System.out.println("Winners in Cycling\n" );
System.out
		.println("-----------------------------------------------------------------------------");
System.out.printf("%10s %30s %10s", "Place", "NAME", "Points");
System.out.println();
System.out
		.println("-----------------------------------------------------------------------------");
for (HashMap.Entry<Integer, String> entry :  winnersListCyclist
		.entrySet()) {
	if(entry.getKey()==1){
		if(userSelectionList.get(0).contentEquals("Cycling") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=10;
	System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),10);
	System.out.println();
	}
	else if(entry.getKey()==2){
		if(userSelectionList.get(0).contentEquals("Cycling") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=5;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),5);
		System.out.println();
		}
	else if(entry.getKey()==3){
		if(userSelectionList.get(0).contentEquals("Cycling") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=3;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),3);
		System.out.println();
		}
	else{
		if(userSelectionList.get(0).contentEquals("Cycling") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=0;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),0);
		System.out.println();
		}
}
System.out
		.println("-----------------------------------------------------------------------------");
System.out.println("Winners in Triathlon\n" );
System.out
		.println("-----------------------------------------------------------------------------");
System.out.printf("%10s %30s %10s", "Place", "NAME", "Points");
System.out.println();
System.out
		.println("-----------------------------------------------------------------------------");
for (HashMap.Entry<Integer, String> entry :  winnersListTriathlon
		.entrySet()) {
	if(entry.getKey()==1){
		if(userSelectionList.get(0).contentEquals("Triathlon") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=10;
	System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),10);
	System.out.println();
	}
	else if(entry.getKey()==2){
		if(userSelectionList.get(0).contentEquals("Triathlon") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=5;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),5);
		System.out.println();
		}
	else if(entry.getKey()==3){
		if(userSelectionList.get(0).contentEquals("Triathlon") && userSelectionList.get(1).contentEquals(entry.getValue()))
			userPoints=3;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),3);
		System.out.println();
		}
	else{
		if(userSelectionList.get(0).contentEquals("Triathlon") && userSelectionList.get(1).contentEquals(entry.getValue()))
		userPoints=0;
		System.out.format("%10s %30s %10s", entry.getKey(), entry.getValue(),0);
		System.out.println();
		}
}
			System.out
				.println("-----------------------------------------------------------------------------");
	
		return userPoints;
 }
}
