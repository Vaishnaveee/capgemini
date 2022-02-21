package com.inheritance;

public class Test {
	public static void main(String[] args) {
		AA a=new AA(); 
		System.out.println(a.x);
		a.m1();
		
		BB bb = new BB();
		System.out.println(bb.x);
		bb.m1();
		
		AA aa = new BB(); 
		System.out.println(aa.x);
		aa.m1();
	
		aa.display(); 
		System.out.println(aa.compute());
}
}
class AA{ 
int x=5;

void m1() {
	System.out.println("M1 in A");
}

protected void display() {
	System.out.println("display in A");
}

public int compute() {
	return 10;
}
}
class BB extends AA{
int x=10;

void m1() {
	System.out.println("M1 in B");
}

public void display(int x) {
	System.out.println("display in B");
}

public int compute(int x) {
	return 20;
}

}
