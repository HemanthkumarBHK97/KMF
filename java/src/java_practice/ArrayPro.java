package java_practice;

public class ArrayPro {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i:a) {
			System.out.println(i);
		}
		String str[] = new  String[5];
		str[0]="Hemanth";
		str[1]="Kumar";
		str[2]="zelly";
		str[3]="christina";
		str[4]="moon";
		//str[5]="Light";
		
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println(str.length);
	}

}
