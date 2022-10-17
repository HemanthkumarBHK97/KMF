/* Single  inheritance concept 
 * From parent to child class
 * child class is derived from the parent class*/
class Parentpa{
	int A=100;
	void parent1() {
		System.out.println("Parent class"+A);
	}
}
class Childca  extends Parentpa{
	int B=200;
	void Child() {
		System.out.println("Child class "+B);
	}
}
public class InheritPTC
{
	public static void main(String[] args)
	{
		/* we can access the child class members and variables and members
		 * from the parent class
		 */
		Childca c =new Childca();
		System.out.println(c.B);
		c.Child();
		System.out.println(c.A);
		c.parent1();
	
	}
}
