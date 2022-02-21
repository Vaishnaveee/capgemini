package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {
public static void main(String[] args) {
	
	System.out.println("---current date and time---");
	LocalDate ld = LocalDate.now();
	LocalTime lt = LocalTime.now();
	LocalDateTime ldt = LocalDateTime.now();
	
	System.out.println("----custom date and time---");
	LocalDate cld = LocalDate.of(2025,Month.FEBRUARY, 13);
	LocalTime clt = LocalTime.of(10, 20, 50);
	LocalDateTime cldt = LocalDateTime.of(2022, Month.DECEMBER, 16, 5, 30);
	System.out.println(cld);
	System.out.println(clt);
	System.out.println(cldt);
	
	 
	
}

}