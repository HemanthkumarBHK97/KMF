package java_practice;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//int c=a+b;
		//Arithmetic  operators   +     -       *       /       %
		//Relational  operators    <     >      <=         >=       !=      ==      (return boolean value true/false)
		//Logical operators       &&               ||                    !                         (return boolean value true/false)
		//Assignment       =                   +=                     *=              /=
		//Increment             ++
		//Decrement         --
		
		//Arithmetic  operators   +     -       *       /       %
		/*System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);*/
		
		//Relational  operators    <     >      <=         >=       !=      ==      (return boolean value true/false)
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
		int c=100;
		c++;
		c--;
		c=c+1;
		c=c-1;
		System.out.println(c);
		
	}
}
