package com.exceptiondemo;
import java.io.IOException;
public class App3 {
	public static void main(String[] args) {
		C c=new C(); 
		try {
			c.m1(99);
		}
		catch(IOException e) { 
			System.out.println("IO Exception thrown");
		}
		
		System.out.println("Thanx");
	}
}
class C{
    public void m1(int marks) throws IOException{ 
    	if(marks>100)
		   throw new IOException(); 
    	
    	System.out.println("Processed");
	}
}
