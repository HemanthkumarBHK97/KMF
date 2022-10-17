
public class CountPrimeNumb
{
	static boolean isPrimeNumber(int x)
	{
		for (int i=2; i<=x/2;  i++) 
		{
			if (x%i==0)
			return false;
	}
		return true;
	}

	public static void main(String[] args) 
	{
		int count =0;
		for (int k=1; k<=100; k++)
		{
			boolean rs =isPrimeNumber(k);
			if(rs ==true)
				count++;
		}
		System.out.println("Number of prime Number:"+count);
	}

}
