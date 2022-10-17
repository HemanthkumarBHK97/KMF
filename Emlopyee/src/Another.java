
public class Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a =new Account(123,5);
		System.out.println(a.getBalance());
		System.out.println(a.getpsd());
		a.setBalance(123, 5);
		a.setpsd(123, 321);
		System.out.println(a.getBalance());
		System.out.println(a.getpsd());
		
	}

}
