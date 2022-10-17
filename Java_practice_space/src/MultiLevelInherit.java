
class A{
	int a=10;
	int b=20;
	void display() {
		System.out.println("Grand parent");
	}
}
class B extends A
{
	int c=100;
	int d=200;
	void show() {
		System.out.println("Parent");
	}
}
class Chi extends B{
	int e=1000;
	int f=2000;
	void fash() {
		System.out.println("child");
	}
}
public class MultiLevelInherit
{

	public static void main(String[] args) 
	{
		Chi child=new Chi();
		System.out.println(child.e);
		System.out.println(child.f);
		child.fash();
		System.out.println(child.c);
		System.out.println(child.d);
		child.show();
		System.out.println(child.a);
		System.out.println(child.b);
		child.display();
		
		
	}

}
