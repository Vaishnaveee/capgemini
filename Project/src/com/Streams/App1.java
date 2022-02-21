package com.Streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {
	private static  String Collectors = "";

	public static void main(String[] args) {
		Product p1= new Product(1,"Vivo", 20000, "ABC Electronics");
		Product p2= new Product(2,"Oppo", 30000, "xyz Electronics");
		Product p3= new Product(3,"Samsung", 25000, "pqr Electronics");
		Product p4= new Product(4,"Nokia", 15000, "lmn Electronics");
		Product p5= new Product(5,"Redmi", 22000, "ABC Electronics");
		List<Product> list= new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5));

		//calculate sum of all price 
		double sumPrices=list.stream()
				.map(p->p.getPrice())
				.reduce(0.0,Double::sum);
		System.out.println("sum"+ sumPrices);
		
		
	//alternative way
		
		
		
		double sum2=list.stream()
				.collect(Collectors.summingDouble(p->p.getPrice()));
			
				//.collect(Collectors.summingDouble(p->p.getPrice()));
		
		System.out.println("sum aleternativ way"+ sum2);
		
		double max=list.stream()
				.map(p->p.getPrice())
				.reduce(0.0,Double::max);
		System.out.println(" max  price"+ max);
		
		double min1=list.stream()
				.map(p->p.getPrice())
				.reduce(70000.0,Double::min);
		System.out.println(" min  price"+ min1);
		
		

	}
	}