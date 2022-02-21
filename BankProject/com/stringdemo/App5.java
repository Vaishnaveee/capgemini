package com.stringdemo;

public class App5 {
	public static void main(String[] args) {
		String email="abc@gmail.com";
		
		boolean valid = email.matches("[a-zA-Z_]+@\\w+\\.\\w+");
		System.out.println("Email validation " + valid);
	}
}
