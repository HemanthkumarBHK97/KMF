import java.util.Scanner;
public class BigestValues
{
	public static void main(String[] args) 
	{
		Scanner A =new Scanner(System.in);
		System.out.println("Enter A Number");
		int a =A.nextInt();
		int b=A.nextInt();
		int c=A.nextInt();

		int big =a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println("Bigest value is : "+big);
	}

}
