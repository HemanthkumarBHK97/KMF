
public class ConstDay27 
{
	int id;
	String name;
	String branch;
	float num;
	double dob;
	public ConstDay27(int id, String name,String branch,float num,double dob)
	{
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.num=num;
		this.dob=dob;
	}
	
	public static void main(String[] args)
	{
		ConstDay27 obj=new ConstDay27(1423,"Hemanth","mech",91,5455);
		System.out.println(obj.id+obj.name+obj.branch+obj.num+obj.dob);
		System.out.println(obj.name);
		System.out.println(obj.branch);
		System.out.println(obj.num);
		System.out.println(obj.dob);
		ConstDay27 obj2=new ConstDay27(0000,"kumar","cse",90,555);
		System.out.println(obj2.id+obj2.name+obj2.branch+obj2.num+obj2.dob);
		
		
		

	}

}
