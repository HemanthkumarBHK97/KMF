package java_practice;

public class Method_Constructor_Overloading {
	int a;
	int b;
	 void sum() {
		 a=10;
		 b=20;
		 System.out.println(a+b);
	 }
	 void sum(int x,int y) {
		 int a=x;
		 int b=y;
		 System.out.println(a+b);
	 }
	 void sum(int x , int y ,int z) {
		 System.out.println(x+y+z); 
	 }
	 void sum(int x, double y ) {
		 System.out.println(x+y);
	 }
	public static void main(String[] args) {
Method_Constructor_Overloading mco =new Method_Constructor_Overloading();
mco.sum();
mco.sum(10,20);
mco.sum(200, 52.0);
mco.sum(100, 200, 300);
	}

}
