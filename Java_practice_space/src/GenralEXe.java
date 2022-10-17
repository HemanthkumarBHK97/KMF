	//constructor OVer loading 
public class GenralEXe 
{
//Constructor with arguments
	GenralEXe(int a)
	{
		System.out.println(a);
}
	//default constructor
 GenralEXe() {
	int a=41;
	int b=41;
	int y=a+b;
	System.out.println(y);
	}
	public static void main(String[] args) 
	{
		GenralEXe g =new GenralEXe();
		GenralEXe g1=new GenralEXe(10);
	}

}
