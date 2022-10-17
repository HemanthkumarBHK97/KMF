
public class construct 
{ 
	String firstname;
	String lastname;
	int id;
	public construct(String firstname,String lastname,int id) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.id=id;
	}
	public construct()
	{
		
		
	}
	
	void display() 
	{
		System.out.println("print fristname :"+firstname);
		System.out.println("Print lastname :"+lastname);
		System.out.println("print id :"+id);
	}

	public static void main(String[] args)
	{
		construct s1 =new construct("hemanth","kumar",1465);
		//System.out.println(s1.firstname);
		//System.out.println(s1.lastname);
		
		//System.out.println(s1.id);
		s1.display();
		construct s2=new construct("deepak","deep",1997);
		s2.display();
		//construct s3=new construct();
		construct s3=new construct();
		s3.display();
	}

}
