package com.staticdemo;

public class App {
	public static void main(String[] args) {
		A a=new B(); 
		a.display(); //
	}
}


class A{ 
	static void display() {
		System.out.println("display in A");
	}
}

class B extends A{ 
	static void display() {
		System.out.println("display in B");
	}
}