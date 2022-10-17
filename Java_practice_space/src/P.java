class P{
	int AB =250;
	String Pa="Parent";
	void Parent()
	{
		System.out.println("Parent class");
		
	}
}
class C  extends P
{
	int ab=300;
	String chi="Child";
	void Child() {
		System.out.println("Child class");
	}
}
class Inherit
{
	public static void main(String []args) 
	{
		C c=new C();
		System.out.println(c.ab);
		c.Child();
		System.out.println(c.AB);
		c.Parent();
		
		
		
	}
	
}