package java_practice;

class Aa{

	private int  i;  // dec 

	 public Aa(){
		i=10;           // initi
	}
	 public int getters(){
		return i;
	}
}
public class Access {
	public static void main(String[] args) {
		Aa bb =new Aa();
		int x = bb.getters();
		System.out.println(x);
		}  
}