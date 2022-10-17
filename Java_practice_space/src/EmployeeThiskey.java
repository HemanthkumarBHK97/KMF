
public class EmployeeThiskey
{
	 String Employename="hemanth";
	  int Employeid = 12545;
	 double Employesalary=500000;
	
	 void Employeeinfo()
	{
		/*Employename="hemanth";
		Employeid= 1255;
		Employesalary=200000;*/
		System.out.println("Employee name: "+Employename);
		System.out.println("Employee ID: "+Employeid);
		System.out.println("Employee salary: "+Employesalary);
		
	}

	public static void main(String[] args)
	{
		EmployeeThiskey obj=new EmployeeThiskey();
		obj.Employeeinfo();
		//EmployeeThiskey.Employeeinfo();
	}
	

}
