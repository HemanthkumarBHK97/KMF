package practice;

public class Normal_Method {
	String getMethod(){
		String name="Hemanth";
		String LastName="Kumar";
		String data= name+LastName;
		return name;
		}
         static void add( int a,int b) {
        	 a=10;
        	 b=100;
        	int c=a+b;
        	System.out.println(c);
	}
	public static void main(String[] args) {
		Normal_Method nom= new Normal_Method();
		System.out.println(nom.getMethod());
		//nom.add(10, 20);
		add(10,20);
		
		
	}
}
