package Junitdemo.service;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class MapserviceTest {
 public Mapservice mapservice;
 @Before
 public void initTest() {
	 mapservice=new Mapservice();
	 
 }
 @Test
 public void addplayerTest() {
	Assert.assertEquals("team and player added", mapservice.addPlayer("csk", "M S Dhoni"));
	Assert.assertEquals("player added in team", mapservice.addPlayer("csk", "D Chahar"));
	Assert.assertEquals("team and player added", mapservice.addPlayer("mi", "R sharma"));
	// System.out.println(mapservice.ipl);
	 	
 }
 @Test
 public void removeplayerTest() {
		Assert.assertEquals("team not present", mapservice.removeplayer("csk", "M S Dhoni"));
		mapservice.addPlayer("csk", "M S Dhoni");
		mapservice.addPlayer("csk", "D Chahar");
		mapservice.addPlayer("mi", "R sharma");
		Assert.assertEquals("player removed from team", mapservice.removeplayer("csk", "D Chahar"));
		Assert.assertEquals("player removed from team", mapservice.removeplayer("csk", "R sharma"));
		Assert.assertEquals("player does not exists in the team", mapservice.removeplayer("csk","R sharma"));
		
 }
 @Test
 public void countplayerTest() {
	 Map<String, Integer> map=new HashMap<>();
	 Assert.assertEquals(map,  mapservice.countPlayers());
	 mapservice.addPlayer("csk", "M S Dhoni");
		mapservice.addPlayer("csk", "D Chahar");
		mapservice.addPlayer("mi", "R sharma");
		map.put("csk",2);
		map.put("mi",1);
		Assert.assertEquals(map,  mapservice.countPlayers());
		
	 
 }
  
 
}
