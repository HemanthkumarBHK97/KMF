package java_practice;

interface FristClass{
	int a=120;
	void oneClassMethod();
}
interface SecondClass  {
	int b=220;
	void secondClassMethod(); 
}
public class InterFaceExe  implements FristClass,SecondClass{
	public	void oneClassMethod() {
		System.out.println("hello world");
		}
	 public void  secondClassMethod() {
		System.out.println("second class method");
	}

	public static void main(String[] args) {
	InterFaceExe ocn=new InterFaceExe();
		ocn.oneClassMethod();
		InterFaceExe sec=new InterFaceExe();
		sec.secondClassMethod();
	}
	}
