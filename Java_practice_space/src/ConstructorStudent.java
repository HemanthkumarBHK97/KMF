
public class ConstructorStudent
{
	String name;
	int rollno;
	
	/*ConstructorStudent() 
	{
		name="zelly";
		rollno=1432;
	}*/
	
ConstructorStudent(String nam,int roll)
{
	name=nam;
	rollno =roll;
}


	public static void main(String[] args)
	{
		/*ConstructorStudent S1 =new ConstructorStudent();
		
		System.out.println(S1.name);
		System.out.println(S1.rollno);
		*/
		ConstructorStudent S2=new ConstructorStudent("hemanth",12);
		
		System.out.println(S2.name);
		System.out.println(S2.rollno);
		

	}

}
