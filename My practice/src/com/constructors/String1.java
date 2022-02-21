package com.constructors;

public class String1 {
public static void main(String[] args) {
	String email="abc@gmail.com";
	
	boolean valid = email.matches("\\w+@\\w+\\.\\w+");
  System.out.println("Email validation" + valid);			
}

}
