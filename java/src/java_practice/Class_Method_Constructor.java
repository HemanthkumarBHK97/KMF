package java_practice;

public class Class_Method_Constructor {
	int empId;
	String empName;
	int deptNo;
	int salary;
	//this is for constructor
	/*Class_Method_Constructor(int id,String name, int dno,int sal){
		this.empId=id;
		this.empName=name;
		this.deptNo=dno;
		this.salary=sal;
	}*/
	void details_of_person(int id, String name, int dno, int sal)
		{
		empId=id;
		empName=name;
		deptNo=dno;
		salary=sal;
		}
	void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(deptNo);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		// using object to providing values
		
	/*	Class_Method_Constructor cmc=new Class_Method_Constructor();
		cmc.empId=101;
		cmc.empName="Hemanth Kumar";
		cmc.deptNo=15154;
		cmc.salary=450000;
		cmc.display();
		Class_Method_Constructor cmc1=new Class_Method_Constructor();
		cmc1.empId=102;
		cmc1.empName="zelly";
		cmc1.deptNo=14141;
		cmc1.salary=500000;
		cmc1.display();*/
		
		// using constructor to provide the values
		/*Class_Method_Constructor  details=new  Class_Method_Constructor(101,"Hemanth",15454,800000);
		details.display();
		
		Class_Method_Constructor details2=new Class_Method_Constructor(102,"kumar",54,45000);
		details2.display();*/
		
		//Using method  to provide the values
		Class_Method_Constructor det =new Class_Method_Constructor();
		det.details_of_person(12150, "Bhajantri", 1254, 520000);
		det.display();
	
		
		
		
		
	}
}
