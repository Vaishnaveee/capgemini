package com.cg.app;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Demo1 {
	
		public static void main(String[] args) {
		
			List<Employee> list= new ArrayList<>();
			Employee e=new Employee();
			Employee e1=new Employee(1,"betty","",4000);
			Employee e2=new Employee(2,"jughead ","",4000);
			Employee e3=new Employee(3,"vronica","",4000);
			Employee e4=new Employee(4,"Archie","",700);
			Employee e5=new Employee(5,"cheryl","",10000);
			
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			list.add(e5);
		
list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
System.out.println(list);
}


}


	

