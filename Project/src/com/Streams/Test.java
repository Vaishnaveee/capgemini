package com.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Test {
	/*public static void main(String[] args) {
		List<Student> list = new ArrayList<>(
				Arrays.asList(new Student(1,"harry","EXTC"),new Student(2,"ron","MECH"),new Student(3,"draco","IT") ));
	
		System.out.println(countStudentgroupByDept(list));
	}
	
	static Map<String,Long> countStudentgroupByDept(List<Student> list){
		Map<String,List<Student>> map = list.stream()
					.collect(Collectors.groupingBy(Student :: getDept));
		
		HashMap<String,Long> map1=new LinkedHashMap<>(); 
		
		for(Map.Entry<String,List<Student>> entry: map.entrySet()) {
			String key = entry.getKey();
			long val = entry.getValue().size();
			map1.put(key, val);
		}
		return map1;
	})*/
}