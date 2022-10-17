 


class InheritClass
{
int a=10;
	void parent()
	{
		System.out.println("i am from parent class"+a);
	}
}	
class ChildINT extends InheritClass
{
	int b=20;
	void child() 
	{
		System.out.println("i am from child class"+b);
}
}
class ParentINT
{
	 public static void main(String[] args){
		 ChildINT  i=new ChildINT();
		 System.out.println(i.b);
		 i.child();
		 System.out.println(i.a);
		 i.parent();

		 
	 }
}
