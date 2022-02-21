package com.collectionsframework;
import java.util.ArrayList;
import java.util.List;
public class App {
	public static void main(String[] args) {
		
		//Type 1 : pure
		ArrayList list1 = new ArrayList(); 
		
		

		List list = new ArrayList(); 
		list.add(1);
		list.add(1.0F);
		list.add(1.0);
		list.add("abc");
		
		System.out.println(list);
		
		List<Integer> lst = new ArrayList<>(); 
		lst.add(1);
		lst.add(2);
		
		System.out.println(lst);
	}
}






