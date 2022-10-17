import java.util.Scanner;
public class ScannEx {

	public static void main(String[] args) 
	{
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Name");
		String Name = obj.next();
		System.out.println("Enter Age");
		int Age = obj.nextInt();
		System.out.println("Enter Mobile number");
		double Number= obj.nextDouble();
		System.out.println("Name "+Name);
		System.out.println("Age "+Age);
		System.out.println("Number "+Number);
		obj.close();

	}
}
