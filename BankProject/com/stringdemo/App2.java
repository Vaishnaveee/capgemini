package com.stringdemo;

public class App2 {
	public static void main(String[] args) {

		StringBuilder sb1=new StringBuilder("abc");
		StringBuilder sb2=new StringBuilder("abc");
		
		System.out.println(sb1.equals(sb2)); 
		System.out.println(sb1 == sb2);
	 	
		sb1.append("pqr"); 
		System.out.println(sb1);
		
		sb1.delete(1, 3);
		System.out.println(sb1);
		
		sb1.insert(1, "bc");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);

		String str="harry";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);

		String s = sb1.reverse().substring(3);
		System.out.println(s);
		String s1 = sb1.substring(1,3);
		System.out.println(s1);

	}
}
