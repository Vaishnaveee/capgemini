package Assignments;


import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EnployeeTest {
	

	@Test
	public void getCountTest() {
		
		
	App a =new App();
		List<Employee> list= new ArrayList<>();
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
		
		HashMap<String,Long> map= new HashMap<>();
		map.put("male",4L);
		map.put("Female", 1L);
		
		Assert.assertEquals(map, a.getCount(list));
	}
	
	

}