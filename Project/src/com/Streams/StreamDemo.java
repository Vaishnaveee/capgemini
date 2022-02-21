package com.Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Streams.EmployeeInfo.SortMethod;

public class StreamDemo {
public static void main(String[] args) {
	 
	EmployeeInfo info=new EmployeeInfo();
	List<Employee> list=new ArrayList<>();
	
	Employee e1= new Employee ("Ross",10000);
	Employee e2=new Employee("Joey",15000);
	Employee e3=new Employee("Chandler",5000);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	System.out.println(info.sort(list, SortMethod.BYNAME));
}
}
class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [name=%s, salary=%s]", name, salary);
	}
}
	
	class EmployeeInfo{
		enum SortMethod{
			BYNAME,BYSALARY
		}
		
		public List<Employee> sort(List<Employee> emps, final SortMethod method){
			List<Employee> sortedList = new ArrayList<>();
			
			if(method.toString().equals("BYSALARY")) {
				 sortedList = emps.stream()
						.sorted(Comparator.comparingInt(Employee :: getSalary))
						.collect(Collectors.toList());
				
			}
			else if(method.toString().equals("BYNAME")) {
				
				sortedList = emps.stream()
							.sorted(Comparator
							.comparing(Employee :: getName))
							.collect(Collectors.toList());
				
			}
			return sortedList;
		}
		
		public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character) {
			
			boolean isPresent = entities.stream()
								.allMatch(p->p.getName().toLowerCase().startsWith(character.toLowerCase()));
			return isPresent;
		}
	

		
	
}

