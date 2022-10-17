package com.actitime.pom;

public class B {

	public static void main(String[] args) {
A aa=new A(300);
int Acls = aa.getValue();
System.out.println(Acls);
aa.setValue(200);
System.out.println(aa.getValue());
	}
}
