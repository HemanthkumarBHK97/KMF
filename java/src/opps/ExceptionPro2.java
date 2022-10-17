/*>>>> create an array.
>>>>store values.
>>>>handle exeption.
>>>>use try with miltiple catches.
>>>>use final block*/

package opps;

public class ExceptionPro2
{

	public static void main(String[] args) 
	{
		try {
		int ar[]= {100,254,455,563,576,145};
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar[7]);
		}
		catch(Exception a)
		{
			System.out.println(a);
			System.out.println("catcing arry");	
		}	
	}
}
