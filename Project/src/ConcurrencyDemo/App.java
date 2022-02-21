package ConcurrencyDemo;
import java.util.concurrent.*;
import java.util.*;
public class App {
public static void main(String[] args) {
	ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<>();
	
	map.put(1,"harry");
	map.put(2, "draco");
	map.put(4,"ron");
	
	map.putIfAbsent(2, "draco");
	map.putIfAbsent(3, "neveile");
	System.out.println(map);

	//put will replace existing value with new value
	map.put(1,"snape");
	System.out.println(map);
	//replace will also replace existing value with new value
	
	map.replace(1, "snape", "harry");
	System.out.println(map);
	
	//removal of value 
	
	map.remove(4);
	System.out.println(map);
	
	map.clear();
	System.out.println(map);
}
}
