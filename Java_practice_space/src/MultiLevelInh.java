
class Grand_Parent
{
	int pa=100;
	void Gparent() {
		System.out.println("From Grand Parent class");
	}
}
class Parent1 extends Grand_Parent
{
	int ca=200;
	void parent() {
		System.out.println("From parent class");
	}
}
class Child1 extends  Parent1{
	int cc=300;
	void child() {
		System.out.println("from child class");
	}
}
public class MultiLevelInh 
{
	public static void main(String[] args) 
	{
		Child1 c=new Child1();
		System.out.println(c.cc);
		System.out.println(c.ca);
		System.out.println(c.pa);
		c.Gparent();
		c.parent();
		c.child();
		Parent1 p=new Parent1();
		System.out.println(p.pa);
		p.Gparent();
		
	}

}
