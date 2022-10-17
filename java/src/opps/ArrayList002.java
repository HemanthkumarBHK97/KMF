
package opps;
import java.util.ArrayList;

public class ArrayList002 
{
		public static void main(String[] args)
		{
			ArrayList<Object>a= new ArrayList<Object>();
			a.add("hemanth");
			a.add("B");
			a.add("kumar");
			a.add(25.2);
			a.add(2500);
			System.out.println(a);
			a.add(2,"hemanth");
			System.out.println(a);
			boolean b=a.contains(100);
			if(b==true)
			{
				System.out.println("250 is present in the list");
			}
			else
			{
				System.out.println("Not present");
			}
			
		}
	}


