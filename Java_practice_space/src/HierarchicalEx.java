class ParentPP{
	int pp=100;
	void parentIN ( ) {
		System.out.println(pp+"From parent class");
	
	}
}
class ChildONE  extends ParentPP{
	int  co=200;
	void  childONEin() {
		System.out.println(co+"from  FIRST child class");
	}
}
class ChildTWO extends ParentPP{
	int ct=300;
		void childTWOin() {
			System.out.println(ct+"from  SECOND child");
		}
}
public class HierarchicalEx {

	public static void main(String[] args) {
		ChildTWO c2=new ChildTWO();
		System.out.println(c2.ct);
		c2.childTWOin();
		System.out.println(c2.pp);
		c2.parentIN();
		
		ChildONE c1=new ChildONE();
		System.out.println(c1.co);
		c1.childONEin();
		System.out.println(c1.pp);
		c1.parentIN();
	}

}
