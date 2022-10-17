package com.actitime.pom;

public class B {

	public static void main(String[] args) {
//		A aa =new A(500);
//		int get = aa.getMethod();
//		System.out.println(get);
//		aa.setMethod(50);
//		System.out.println( aa.getMethod());	
		
		A aa =new A(200);
		int data = aa.getDATA();
		System.out.println(data);
		aa.setDATA(500);
		System.out.println(aa.getDATA());
		
	}
	

	
}
