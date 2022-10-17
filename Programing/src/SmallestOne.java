import java.util.Scanner;
public class SmallestOne {

	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter Four Digits");
		int a=S.nextInt();
		int b=S.nextInt();
		int c=S.nextInt();
		int d=S.nextInt();
		int Small =a;
		if(a<Small)
			Small=b;
		if(c<Small)
			Small=c;
		if(d<Small)
			Small=d;
			System.out.println(Small+"it is a smallest number");
		
	}

}
