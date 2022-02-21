package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

 public class Candidate { 
	
	int id;
	String name;
	double salary;
	public Candidate (int id, String name, double salary) {
	
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return String.format("Candidate [id=%s, name=%s, salary=%s]", id, name, salary);
	}

	class Sort1{	
		public Optional<List<Candidate>> getSorted(List<Candidate> list){
			
			Collections.sort(list,new B());
			return Optional.of(list);
		}	
	}
	class B implements Comparator<Candidate>{

		@Override
		public int compare(Candidate e1, Candidate e2) {
			int y=e1.getName().compareTo( e2.getName());
			return y;
		}
	}
	class Sort2{	
		public Optional<List<Candidate>> getSortedSalary(List<Candidate> list){
			
			Collections.sort(list,new C());
			return Optional.of(list);
		}	
	}
	class C implements Comparator<Candidate>{

		@Override
		public int compare(Candidate e1, Candidate e2) {
		 return (int) (e1.getSalary()-e2.getSalary());
		}
	}
	class Sort3{
		public Optional<List<Candidate>> getSortedSalaryDesc(List<Candidate>list){
			
			Collections.sort(list,new D());
			return Optional.of(list);
		}
		public char[] getSorted(List<Candidate> list) {
			
			return null;
		}	
	}
	class D implements Comparator<Candidate>{
		@Override
		public int compare(Candidate e1, Candidate e2) {
		 return (int) (e2.getSalary()-e1.getSalary());
		}
	}
	class AvgSalary{
		double a=0;
		double a1=0;
		
		public double FindAvgSalaries(List<Candidate>list)	{
			
			for(Candidate c:list) {
				a =c.getSalary();
				a++;
				a1=a1+c.getSalary();
				 
				}
			double b=a1/a;
			return b;	
			}
		}
	List<Candidate> list=new ArrayList<>();
	List <Candidate> listWithChar(List <Candidate> list,String ch){
		for(Candidate i:list) {
			if(i.getName().startsWith(ch)) {	
				list.add(i);		
			}
		}	
		return list;
		}
 }
		
	
 

 