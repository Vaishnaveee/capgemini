package Junitdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapservice {
 public Map<String, ArrayList<String>> ipl= new HashMap<>();
  public String addPlayer (String team, String playerName) {

	   /*
	    *step 1:
	    *check if the team is present in the map.
	    *if (present)- add player name to the list of players of that team 
	    * if (not present)- add team in map and add the player to the list of 
	    */
	  boolean ispresent=ipl.containsKey(team);
	  if (ispresent) {
		  ArrayList<String> playerList= ipl.get(team);
		  playerList.add(playerName);
		  return "player added in team";
	  }
	  else {
		  ArrayList<String> playList=new ArrayList<>();
		  playList.add(playerName);
		  ipl.put(team, playList);
		  return "team and player added";
	  }
  }
   public String removeplayer(String team , String playerName) {
	   
	    boolean isPresent=ipl.containsKey(team);
	    if(isPresent) {
	    	ArrayList<String> players=ipl.get(team);
	    	if (players.remove(playerName)) {
	    	return "player removed from team";
	    	}
	    	else {
	    	return "player does not exists in the team";
	        }
	    }
	    else {
	    	return "team not present";
	    }
   }
 public Map<String,Integer> countPlayers(){
	 Map<String, Integer> map=new HashMap<>();
 for (String key : ipl.keySet()){
	 ArrayList<String>list=ipl.get(key);
	 int num=list.size();
	 map.put(key, num);
	 }
return map;
 }

}

