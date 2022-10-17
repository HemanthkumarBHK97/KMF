import java.util.Scanner;
public class TwoDigit
{
	public static void main(String[] args) 
	{
		Scanner A =new Scanner(System.in);
		System.out.println("Enter A Number");
		int a =A.nextInt();
		int b=A.nextInt();
		int c=A.nextInt();

		if(a>b&& a>c)
		System.out.println("Bigest value is : "+a);
		else if(b>c)
			System.out.println("Bigest value is :"+b);
		else {
			System.out.println("bigest value is:" +c);
		}
	}

}
