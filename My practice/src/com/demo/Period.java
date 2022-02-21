package com.demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Period {
public static void main(String[] args) {
	 LocalDate ld1=LocalDate.now();
	 LocalDate ld2=LocalDate.of(2022, Month.JANUARY, 1);
	 
	 int days= java.time.Period.between(ld2, ld1).getDays();
	 int months=java.time.Period.between(ld2, ld1).getMonths();
	 System.out.println(days);
	 System.out.println(months);
	 
	 long d =ChronoUnit.DAYS.between(ld2, ld1);
	 long m= ChronoUnit.MONTHS.between(ld2, ld1);
	 System.out.println(d);
	 System.out.println(m);
	 
	 LocalTime currentTime= LocalTime.now();
	 LocalTime transactionTime=LocalTime.of(2, 30);
	 
	 Duration duration= Duration.between(transactionTime, currentTime);
	 System.out.println(duration.toMinutes());
	 System.out.println(duration.toHours());
	 
	 long mins= ChronoUnit.MINUTES.between(transactionTime, currentTime);
	 long hours=ChronoUnit.HOURS.between(transactionTime, currentTime);
	 
	 System.out.println(mins);
	 System.out.println(hours);
	 
	 
	 
	 
}
}
