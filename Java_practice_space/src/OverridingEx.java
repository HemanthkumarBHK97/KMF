
class ParentMain{
	void MainOne(int a) {
		System.out.println("Parent class"+a);
	}
}
class ChildMain extends ParentMain{
	void MainOne(int b ) {
		System.out.println("child class"+b);
	}
}
public class OverridingEx  
{
	public static void main(String[] args)
	{
		ChildMain n = new ChildMain();
		n.MainOne(10);
		n.MainOne(20);

	}

}
