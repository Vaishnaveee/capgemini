package com.staticdemo;
import static com.staticdemo.C.x;
import static com.staticdemo.C.display;

public class Test {
	public static void main(String[] args) {
		C c=new C();//10
		 c.display();
		 
		System.out.println(C.x); 
		C.display();

		System.out.println(x);
		display();
		
	}
}	
 
