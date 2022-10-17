import java.util.Scanner;


class PositiveNegitive{
	
	public static void main(String[] args)
	{
		
		Scanner PN =new  Scanner(System.in);
		System.out.println(" Enter a INTEGER value :");
		int num=PN.nextInt();
		if(num>0.0)
		{
			System.out.println("it is positiv number");
		}
		
		else if(num<0.0)
		{
			System.out.println("it is a negitive number");
				
			}
		else {
			System.out.println("it is zero");
			
		}
		}
		
	}