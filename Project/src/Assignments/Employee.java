package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int joiningYear;
	double salary;
	public Employee(int id, String name, int age, String gender, String department, int joinigYear, double salary) {	
	
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.department=department;
	this.joiningYear=joiningYear;
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, age=%s, gender=%s, department=%s, joiningYear=%s, salary=%s]",
				id, name, age, gender, department, joiningYear, salary);
	}

public static void main (String[]args) {
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(1,"harry potter",18,"male","HR",2022, 85000));
	list.add(new Employee(2,"ron weasley",15,"male","product development",2019,40000));
	list.add(new Employee(3,"harmonie granger",20,"female","product development",2019,35000));
	list.add(new Employee(4,"draco malfoy",17,"male","HR",2018,25000));
	list.add(new Employee(5,"nevile longbottom",21,"male","HR",2020,50000));
	list.add(new Employee(6,"luna lovegood",22,"female","product development",2021,550000));
	list.add(new Employee(7,"sirius black",32,"male","product development",2015,85000));
	list.add(new Employee(8,"bellatrix lastrange",25,"female","HR",2015,20000));
	list.add(new Employee(9,"severus snape",30,"male","HR",2016,80000));
	list.add(new Employee(10,"cedric degory",25,"male","product development",2022,30000));
	
	System.out.println(getCount(list));
	System.out.println(getAverageAge(list));
	System.out.println(getCountDepartment(list));
	System.out.println(getYoungestDetails(list));
	
} 

static HashMap<String ,Long>  getAverageAge(List<Employee> list) {
	List<Integer> listM=new ArrayList<>();
	List<Integer> listF=new ArrayList<>();
	HashMap<String, Long> map=new HashMap<>();
	int sumM=0,sumF=0;
	
	   for (Employee e:list) {
		   if(e.getGender().equals("male")) {
				 listM.add(e.getAge());
				 sumM += e.getAge();
	   }
		   else if (e.getGender().equals("female")) {
				 listF.add(e.getAge());
				 sumF += e.getAge();
		 }
	   }
	  long avgMale =  sumM/listM.size();
	  long avgFemale =  sumF/listF.size();
	  
	  map.put("AvgMale", avgMale);
		map.put("AvgFemale", avgFemale);
	return map;
}


static HashMap<String ,Long>  getCount(List<Employee> list) {
	List<Employee> listM=new ArrayList<>();
	List<Employee> listF=new ArrayList<>();
	HashMap<String, Long> map=new HashMap<>();
	
	for (Employee e:list) {
		 if(e.getGender().equals("male")) {
			 listM.add(e);
		 }
			 else if (e.getGender().equals("female")) {
				 listF.add(e);
		 }
		 
	 }
		long countM= listM.size();
		long countF= listF.size();
	           
		map.put("male", countM);
		map.put("female", countF);
	return map;
}
static HashMap<String ,Long>  getCountDepartment(List<Employee> list) {
	List<Employee> listHR=new ArrayList<>();
	List<Employee> listPD=new ArrayList<>();
	HashMap<String, Long> map=new HashMap<>();
	
	for (Employee e:list) {
		 if(e.getDepartment().equals("HR")) {
			 listHR.add(e);
		 }
			 else if (e.getDepartment().equals("product development")) {
				 listPD.add(e);
		 }
		 
	 }
		long countHR= listHR.size();
		long countPD=listPD.size();
	           
		map.put("HR", countHR);
		map.put("product development", countPD);
	return map;

}
static Employee getYoungestDetails(List<Employee> list) {
	List<Employee> listY=new ArrayList<>();
	Collections.sort(list, new Comparator<Employee>() {
        public int compare(Employee p1, Employee p2) {
            return p1.getAge() - p2.getAge();
        }
    });
	  
	return list.get(0);
}
}
