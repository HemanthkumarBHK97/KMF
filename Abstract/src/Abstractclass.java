abstract class Abstractclass
{
	String brand;
	float price;
	
	Abstractclass(String brand,float price)
	{
		this.brand=brand;
		this.price=price;
		
	}
	abstract public void switchon();
	abstract public void switchoff();
}
class Ebulb extends Abstractclass
{
	String bbrand;
	String type;
	Ebulb(String brand, float price, String bbrand, String type)
	{
		super(brand,price);
		this.bbrand =bbrand;
		this.type=type;
	}
	
	public void view()
	{
		System.out.println("this is my"+bbrand);
		System.out.println("this is my"+price);
	}
	public void switchoff()
	{
	System.out.println("new the bulb off"+brand);
	}
	public void switchon()
	{
		System.out.println("lights on the bulb"+type);
	}
	public static void main(String[] args) 
	{
Ebulb b=new Ebulb("Anchor",300f,"Hawels","LED");
b.switchoff();
b.switchon();
b.view();


	}

}
