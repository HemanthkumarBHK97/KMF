
class Parent
{
	Parent(){
		System.out.println("parent constructor");
	}
	int a=40;
	void display()
	{
		System.out.println("parent class");
	}
}
class Child extends Parent
{
	Child(){ 
		System.out.println("child constructor");
	}
		int a=40;
	void display()
	{
		System.out.println("CHILD CLASS");
		System.out.println(a);
		System.out.println( super.a);
		super.display();
	}
}
public class SuperKey
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display(); 
	}
}
