package com.datesdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		 
		System.out.println("---current date and time---");
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now(); 
		LocalDateTime ldt = LocalDateTime.now(); 
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
		System.out.println("---Custom date and time---");
		
		LocalDate cld = LocalDate.of(2020, Month.JANUARY, 1);
		LocalTime clt = LocalTime.of(10, 20, 30, 100);
		LocalDateTime cldt = LocalDateTime.of(2021, Month.JANUARY, 10, 10, 30);
		System.out.println(cld);
		System.out.println(clt);
		System.out.println(cldt);
		
		System.out.println("-----Manipulating Dates----");
		LocalDate mld = LocalDate.now().plusDays(2); 
		System.out.println(mld); 
		LocalTime mlt = LocalTime.now().minusMinutes(30);
		System.out.println(mlt);
		
		System.out.println("--customizing current date---");
		LocalDate ccld = LocalDate.now().withDayOfMonth(19).withYear(2021);
		System.out.println(ccld);
		
		
		
	}
}
