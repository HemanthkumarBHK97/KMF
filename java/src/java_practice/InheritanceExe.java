package java_practice;

class A{
	int a,b;
	String aa;
	public    void classA() {
		System.out.println(a+aa+b);


	}
}
class B extends A{
	int x,y;
	String bb;
	void classB() {
		System.out.println(x+bb+y);
	}
}
class C extends B{
	int i;
	int j;
	String hh;
	void  classCmethod() {
		System.out.println(i+hh+j);
	}
}
public class InheritanceExe {

	public static void main(String[] args) {
		A aa =new A();
		aa.a=100;
		aa.b=1000;
		aa.aa="hemanth";
		aa.classA();

		B bbc=new B();
		bbc.a=2000;
		bbc.b=4000;
		bbc.aa="Zelly";
		bbc.classA();
		bbc.x=10;
		bbc.y=20;
		bbc.bb="Hemanth kumar zelly";
		bbc.classB();

		C cc =new C();
		cc.i=500;
		cc.j=100;
		cc.hh="zelly kumar Hemanth";
		cc.classCmethod();
	}
}
