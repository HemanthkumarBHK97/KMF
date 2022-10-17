package opps;

class ProJava
{
	void mainMethod() {
		System.out.println("parent class");
	}
}
class Child extends ProJava{
	void mainMethod () {
		System.out.println("child class");
	}	
	public static void main (String []args) {
		Child c=new Child();
		c.mainMethod();
	}
}

