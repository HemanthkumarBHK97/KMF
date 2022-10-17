import java.util.Scanner;
public class Divisable {

	public static void main(String[] args) {
		Scanner D =new Scanner(System.in);
		System.out.println("Enter A digit");
		int a=D.nextInt();
		if(a%3==0  || a%5==0)
			System.out.println("its is divisable by 3,5");
		else
			System.out.println("it is NOT divisable by 3,5");
	}

}
