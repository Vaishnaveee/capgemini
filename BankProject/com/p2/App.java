package com.p2;
import com.p3.D;

public class App {
 public static void main(String[] args) {

	 D d=new D();
	 d.x= 12;
	 D d1 = d;
	 System.out.println(d.x);
	 System.out.println(d1.x);
	 d.x= 16;
	 System.out.println(d1.x);
 }
}

