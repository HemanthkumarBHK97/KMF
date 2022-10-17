package java_practice;

public class ConditionalSts {
	public static void main(String[] args) {
		int day=20;
		switch (day) {
		case 1:System.out.println("Monday");break;
		// why we use break command means  no compare the value if it is matches.
		case 2: System.out.println("tuesday");break;
		case 3: System.out.println("wedsday");break;
		case 4:System.out.println("thursday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saterday");break;
		default:System.out.println("sunday");break;
		}

	}
}
