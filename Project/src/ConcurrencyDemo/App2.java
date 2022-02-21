package ConcurrencyDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class App2 {
	public static void main(String[] args) {
		Student s1= new Student(1,"ross",88,"new york");
		Student s2= new Student(2,"joey",75,"new york");
		Student s3= new Student(3,"chandler",90,"central perk");
		Student s4= new Student(4,"rerachel",92,"new york");
		Student s5= new Student(5,"monica",88,"central perk");
		Student s6= new Student(6,"phoebe",70,"new york");
		
		
		
List<Student>list=new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		ConcurrentHashMap<String,List<Student>> map=new ConcurrentHashMap<>();
		ConcurrentHashMap<String,Long> resultmap=new ConcurrentHashMap<>();
		
		List<String> listcity=list.stream().map(s->s.getCity())
				.distinct()
				.collect(Collectors.toList());
		
		listcity.forEach(c->{
			map.compute(c, (k,v)-> list.stream().filter(s->s.getCity().equals(c)).collect(Collectors.toList()));
			
		});
		System.out.println(map);
		
		listcity.forEach(c->{
			resultmap.compute(c, (k,v)-> list.stream().filter(s->s.getCity().equals(c)).count());
			
		});
		System.out.println(resultmap);


	}
}

class Student{
	int id;
	String name;
	int marks;
	String city;
	public Student(int id, String name, int marks, String city) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.city = city;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return String.format("student [id=%s, name=%s, marks=%s, city=%s]", id, name, marks, city);
	}
	
	
}
