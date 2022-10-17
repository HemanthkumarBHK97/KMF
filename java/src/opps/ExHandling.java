
package opps;
import java.util.Scanner;

public class ExHandling
{

	public static void main(String[] args) 
	{
		Scanner Sc =new Scanner(System.in); 
		System.out.println("Enter first number");
		int num =Sc.nextInt();
		System.out.println("Enter Second number");
		int num1=Sc.nextInt();
		try
		{
		int c=num/num1;
		System.out.println("Result after division is "+c);
		}	
		catch (ArrayIndexOutOfBoundsException  e) 
		{
			System.out.println("hi");
		}
		finally {
			System.out.println("this is final ");
			System.out.println(num+num1);
		}
		
}
}