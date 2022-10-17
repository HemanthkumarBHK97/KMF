
public class MethodMains 
{
	public int sum(int a, int b)
	{ 
		return a+b;
	}
	
	public static void main(String[] args)
	{
		int j=120;
		String name ="hemanth";
		
		System.out.println("my name is" + name);
		
		System.out.println("number is"+j);
		MethodMains obj=new MethodMains();
		int a= obj.sum(12, 15);
		System.out.println(a);
		
		
	}

}