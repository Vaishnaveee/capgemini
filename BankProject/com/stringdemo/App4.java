package com.stringdemo;

public class App4 {
	public static void main(String[] args) {
		String str="91 india 44 UK 566 USA";
		String[] sarry = str.split("\\s");
		
		 for(String temp : sarry) {
			 System.out.println(temp);
		 }	 
		 System.out.println("\n===countries====");
		 sarry = str.split("\\d+\\s");
			
		 for(String temp : sarry) {
			 System.out.println(temp);
		 } 
		 System.out.println("\n====country codes=====");
		 sarry = str.split("\\s[a-zA-Z]+");
		 
		 for(String temp : sarry) {
			 System.out.println(temp.trim());
		 }
	}
}
