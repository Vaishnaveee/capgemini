package ConcurrencyDemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class App1 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map= new ConcurrentHashMap<>();
		
		map.put(1,"harry");
		map.put(2, "draco");
		map.put(4,"ron");
		
		map.putIfAbsent(2, "draco");
		map.putIfAbsent(3, "neveile");
	for (Map.Entry<Integer, String>m: map.entrySet())
	{
		System.out.println(m.getKey()+"----"+ m.getValue());
	}
	System.out.println("---------------");
	map.forEach((k,v)->
	{
		System.out.println( k+"---"+v);
	}
	);
	
	System.out.println("--------------");
	map.forEach((k,v)->	System.out.println( k+"---"+v)	);
	
	System.out.println("-------------");
	
	map.compute(5, (k,v)-> k>4?"snape":null);
	map.compute(5, (k,v)-> k>map.size()?"dumbeldor":v);
	map.compute(5, (k,v)-> k>map.size()?"dumbeldor":null);
	
	System.out.println(map);
	}
	
	
	}
	
