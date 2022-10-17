package opps;

import java.util.*;

class Student1 {
	String name;
	int age;
	int id;
	
	Student1 (String name, int age, int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
	Student1 (String name, int age){
		this.name=name;
		this.age=age;
	}	
}
public class MapEx 
{
	public static void main(String[] args) 
	{
	//	Student1 obj1=new Student1("Hemanth",25,121);
		//Student1 obj2=new Student1("Alex",26,11);
		
		HashMap<String,Object> h =new HashMap<String,Object>();

		h.put("s1",  new Student1("Hemanth",252,3));
		h.put("s2",new Student1("Kumar",454,2));
	
}
	}