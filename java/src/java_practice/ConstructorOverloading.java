package java_practice;

public class ConstructorOverloading {
	
	int x;
	String y;
	//double c;
	
	/*ConstructorOverloading() {
		int a=10;
		int b=20;
	 double	c=30.0;
	}*/
	/*ConstructorOverloading( int x,String y){
		this.x=x;
		this.y=y;
	}*/
	ConstructorOverloading(String y,int x){
		this.x=x;
		y=y;
	
	}
	/*ConstructorOverloading(int x, int y, double z){
		a=x;
		b=y;
		c=z;
	}
	ConstructorOverloading(int x, double z, int y){
		a=x;
		b=y;
		c=z;
	}*/
	
	void display() {
		System.out.println(x);
		System.out.println(y);

	}

	public static void main(String[] args) {
		
		//ConstructorOverloading con =new ConstructorOverloading();
		//ConstructorOverloading con =new ConstructorOverloading(10,20);
		ConstructorOverloading con=new ConstructorOverloading("Hemanth",10);
		//ConstructorOverloading con=new ConstructorOverloading(10,20.0,20);
		//ConstructorOverloading con=new ConstructorOverloading(10,30,20.0);
		con.display();

	}
}
