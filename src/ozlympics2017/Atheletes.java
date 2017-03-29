package ozlympics2017;

import java.util.ArrayList;


public class Atheletes {
	ArrayList <String> runners= new ArrayList<String>();
    ArrayList <String> cyclist= new ArrayList<String>();
    ArrayList <String> swimmers= new ArrayList<String>();
    ArrayList <String> superAthelete= new ArrayList<String>();
    String runnersReferee;
    String swimmersReferee;
    String cyclistReferee;
    String superAtheleteReferee;
	public ArrayList<String> getRunners() {
		return runners;
	}
	public void setRunners(ArrayList<String> runners) {
		this.runners = runners;
	}
	public ArrayList<String> getCyclist() {
		return cyclist;
	}
	public void setCyclist(ArrayList<String> cyclist) {
		this.cyclist = cyclist;
	}
	public ArrayList<String> getSwimmers() {
		return swimmers;
	}
	public void setSwimmers(ArrayList<String> swimmers) {
		this.swimmers = swimmers;
	}
	public ArrayList<String> getSuperAthelete() {
		return superAthelete;
	}
	public void setSuperAthelete(ArrayList<String> superAthelete) {
		this.superAthelete = superAthelete;
	}
	public String getRunnersReferee() {
		return runnersReferee;
	}
	public void setRunnersReferee(String runnersReferee) {
		this.runnersReferee = runnersReferee;
	}
	public String getSwimmersReferee() {
		return swimmersReferee;
	}
	public void setSwimmersReferee(String swimmersReferee) {
		this.swimmersReferee = swimmersReferee;
	}
	public String getCyclistReferee() {
		return cyclistReferee;
	}
	public void setCyclistReferee(String cyclistReferee) {
		this.cyclistReferee = cyclistReferee;
	}
	public String getSuperAtheleteReferee() {
		return superAtheleteReferee;
	}
	public void setSuperAtheleteReferee(String superAtheleteReferee) {
		this.superAtheleteReferee = superAtheleteReferee;
	}
}
