package opps;

import javax.print.DocFlavor.STRING;

public class StringJava
{

	public static void main(String[] args)
	{
		String s ="INDIA";
		String s2="INDIA";
		System.out.println(s==s2);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(s2));
		System.out.println(s.substring(4));
		System.out.println(s.indexOf(2));
		String a=s.toLowerCase();
		System.out.println(a);
		int i=s.indexOf('a');
		System.out.println(i);
		
	

		
		
	}

}
