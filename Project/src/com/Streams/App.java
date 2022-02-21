package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
public static void main(String[] args) {
	Product p1= new Product(1,"Vivo", 20000, "ABC Electronics");
	Product p2= new Product(2,"Oppo", 30000, "xyz Electronics");
	Product p3= new Product(3,"Samsung", 25000, "pqr Electronics");
	Product p4= new Product(4,"Nokia", 15000, "lmn Electronics");
	Product p5= new Product(5,"Redmi", 22000, "ABC Electronics");
	List<Product> list= new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

	List<Double> list1= list.stream().map(p->p.getPrice()).collect(Collectors.toList());
	System.out.println(list1);
	
	List<String> list2= list.stream().map(p->p.getName()).collect(Collectors.toList());
	System.out.println(list2);
	
	List<String> list3= list.stream().map(p->p.VendorName()).distinct().collect(Collectors.toList());
	System.out.println(list3);
	
	List<String> list4= list.stream().map(p->p.VendorName()).collect(Collectors.toList());
	System.out.println(list4);

	long count=list.stream().count();
	System.out.println(count);
	System.out.println("count:"+count);
	
	List<Product> list5=list.stream().filter(p->p.getPrice()>=2000).collect(Collectors.toList());
	System.out.println(list5);
	System.out.println("filtre  :"+ list5);
	count =list.parallelStream().filter(p->p.getPrice()>=200).count();
	
	System.out.println("NO of product having price greater than 2000: " +count);
	
	
	List<Product> list6=list.stream().filter(p->p.getPrice()>=2000)
			.filter(p->p.VendorName().toLowerCase().equals("abc"))
			.collect(Collectors.toList());
	
	
	System.out.println("list of filtred product"+list6);
	
	
}

}
