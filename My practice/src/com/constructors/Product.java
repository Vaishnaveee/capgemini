package com.constructors;

import java.util.StringTokenizer;

public class Product {
public static void main(String[] args) {
	
 String str="hello java";
 String str1="Hello Java";
 
 System.out.println(str.toLowerCase().equals(str1.toLowerCase()));
 
 System.out.println(str.length());
 
 String fname="harry";
 String lname="potter";
 String name=fname.concat(" "+lname);
 System.out.println(name);
 
 String str4= "           harry potter            ";
 System.out.println(str4.length());
 str4=str4.trim();
 System.out.println(str4.length());
 System.out.println(str4);
 
 String str5="hello java";
 String str6="hello java";
 System.out.println(str5.compareTo(str6));
 str6="Hello Java";
 System.out.println(str5.compareTo(str6));
 System.out.println(str6.compareTo(str5));
 
 char c =str6.charAt(3);
 System.out.println(c);
 
 
 String email= "abcd@gmail.com";
 System.out.println(email.contains("@"));
 String email1="abcdgmail.com";
 System.out.println(email1.contains("@"));
 
 System.out.println(email.equals("ABCD@gmail.com"));
 		System.out.println(email.equalsIgnoreCase("ABCD@gmail.com"));
 
 
 		
 	
 
}
	
}

