package opps;

import java.util.ArrayList;


public class ArrayList001
{

	public static void main(String[] args)
	{
		ArrayList<Integer>al= new ArrayList<Integer>();
		al.add(50);
		al.add(100);
		al.add(255);
		al.add(20);
		System.out.println(al);
		al.add(2,25);
		System.out.println(al);
		boolean b=al.contains(20);
		if(b==true) {
			System.out.println("20 is the present in the list");
		}
		else {
			System.out.println("not present");
		}
			int k=al.get(3);
			System.out.println("the element of 3rd index is "+k);
			System.out.println("index of 100 in this list is " + al.indexOf(100));
			System.out.println(al.getClass());
			al.remove(3);
			System.out.println("after removing 3rd index element current list is  "+al);
			al.remove(100);
			System.out.println("after removing 100 from list, then current list is"+al);
			System.out.println(al.remove(2));
			System.out.println("after removing, then current list is "+al);
			System.out.println("size of the list is"+al.size());
			}

	}

