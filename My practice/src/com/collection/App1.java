package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collection.App1.comparator;

public class App1 {
public interface comparator<T> {

	}

public static void main(String[] args) {
	Employee e1=new Employee(1, "harry potter",80000,"MAGIC");
	Employee e2=new Employee(2, "ronald weasley",50000,"MUGGLES");
	Employee e3=new Employee(3, "harminoe granger",300000,"STUDY");
	Employee e4=new Employee(4, "draco malfoy",150000,"DARK ARTS");
	Employee e5=new Employee(5, "luna lovegood",70000,"UNSSEN ART");
	
	List<Employee> list=new ArrayList<>();
	list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);
	 System.out.println("\n======Collection Sorting========");
	 
	 Scanner scan=new Scanner (System.in);
	 while (true) {
		 System.out.println("\n-------DATASET-------");
		 for(Employee e:list) {
			 System.out.println(e);
		 }
		 System.out.println("press 1 for Ascenidng sort");
		 System.out.println("press2 for Decending sort");
		 System.out.println("press0 to exit");
		 int input = scan.nextInt();
		 if (input==0) {
			 System.out.println("Exiting ...Goodbye");
			 break;
		 }
		 switch(input) {
		 case 1:
			Collections.sort(list, new A());
			for (Employee e: list);{
			char[] e;
			System.out.println(e);
			 
		 }
		 case 2:
			 Collections.sort(list, new B());
			 for(Employee e:list) {
				 System.out.println(e);
			 }
			 System.out.println("-------------------");
			 default:
		System.out.println(("\n Invalid Output"));
		
			 
			 
	 }
		 class A implements comparator<Empolyee>{
			 
		 }
			 
		 }
	
}
}


