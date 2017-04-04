package ozlympics2017;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataPopulator {
	
	public Atheletes dataPopulate() throws IOException {
		String sample=null;
		DataFormatter dataFormatter = new DataFormatter();
		File myFile = new File("./Atheletes/AthletesList.xlsx"); 
		FileInputStream fis = new FileInputStream(myFile); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		Atheletes atheletes = new Atheletes();
		Random randomGenerator = new Random();
	    ArrayList <String> runners= new ArrayList<String>();
	    ArrayList <String> cyclist= new ArrayList<String>();
	    ArrayList <String> swimmers= new ArrayList<String>();
	    ArrayList <String> superAthelete= new ArrayList<String>();
	    atheletes.setRunnersReferee(dataFormatter.formatCellValue(mySheet.getRow(randomGenerator.nextInt(2)+3).getCell(CellReference.convertColStringToIndex("B"))));
	    atheletes.setSwimmersReferee(dataFormatter.formatCellValue(mySheet.getRow(randomGenerator.nextInt(2)+3).getCell(CellReference.convertColStringToIndex("D"))));
	    atheletes.setCyclistReferee(dataFormatter.formatCellValue(mySheet.getRow(randomGenerator.nextInt(2)+3).getCell(CellReference.convertColStringToIndex("F"))));
	    atheletes.setSuperAtheleteReferee(dataFormatter.formatCellValue(mySheet.getRow(randomGenerator.nextInt(2)+3).getCell(CellReference.convertColStringToIndex("H"))));
	    HashSet<Integer> numbers= new HashSet<Integer>();
	    ArrayList<Integer> numbersList= new ArrayList<Integer>();
	    
	    while(numbers.size()<5){
	      int randomInt = randomGenerator.nextInt(6)+3;
	      numbers.add(randomInt);
	    }
	    numbersList.addAll(numbers);
	    for(int i=0; i <5; i++){
	    	sample =dataFormatter.formatCellValue(mySheet.getRow(numbersList.get(i)).getCell(CellReference.convertColStringToIndex("A")));
	    	runners.add(sample);
	    }
	    for(int i=0; i <5; i++){
	    	sample =dataFormatter.formatCellValue(mySheet.getRow(numbersList.get(i)).getCell(CellReference.convertColStringToIndex("E")));
	    	cyclist.add(sample);
	    }
	    for(int i=0; i <5; i++){
	    	sample =dataFormatter.formatCellValue(mySheet.getRow(numbersList.get(i)).getCell(CellReference.convertColStringToIndex("C")));
	    	swimmers.add(sample);
	    }
	    for(int i=0; i <5; i++){
	    	sample =dataFormatter.formatCellValue(mySheet.getRow(numbersList.get(i)).getCell(CellReference.convertColStringToIndex("G")));
	    	superAthelete.add(sample);
	    }
	    atheletes.setRunners(runners);
	    atheletes.setCyclist(cyclist);
	    atheletes.setSuperAthelete(superAthelete);
	    atheletes.setSwimmers(swimmers);
	    return atheletes;
	
	}
	
}
