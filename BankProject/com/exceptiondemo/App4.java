package com.exceptiondemo;

public class App4 {
	public static void main(String[] args) {
		AA a=new AA(); 
		try {
			float f=3.5f;  
			a.m1();
		}
		catch(NullPointerException npe) {
			System.out.println("String cannot be null");
		}
		finally {
			 
			a=null;
		}
		
	}
}

class AA{
	void m1() {
		String str= null;
		System.out.println(str.length());  
	}
}
