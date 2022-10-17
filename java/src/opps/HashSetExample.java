package opps;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<Integer>ab =new HashSet<Integer>();
		ab.add(50);
		ab.add(60);
		ab.add(70);
		ab.add(300);
		System.out.println(ab);
		ArrayList<Integer> bc=new ArrayList<Integer>(ab);
		System.out.println(bc);
	    TreeSet<Integer> t=new TreeSet<Integer>(bc);
	     System.out.println(t);
		for (int j:ab)
		{
			System.out.println(j);
	}
		TreeSet<Integer> v =(TreeSet<Integer>) t.descendingSet();
		System.out.println(v);
	}
}
