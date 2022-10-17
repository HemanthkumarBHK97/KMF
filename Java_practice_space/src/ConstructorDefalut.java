

public class ConstructorDefalut
{
	String name;
	int rol;
	ConstructorDefalut() 
	{
		name="hemanth";
		rol=302;
	}

	public static void main(String[] args)
	{
		ConstructorDefalut obj=new ConstructorDefalut();
		System.out.println("hello "+obj.name);
		System.out.println("hi "+obj.rol);

	}

}
