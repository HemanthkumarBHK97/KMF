package opps;
//import java.util.HashMap;
import java.util.*;

public class HashMaping 
{

	public static void main(String[] args)
	{
		TreeMap <String,String> hm  =new TreeMap<String,String>();
		hm.put("Student1","Hmeanth");
		hm.put("Student2","ABC");
		hm.put("Student3","DEF");
		hm.put("Student4","IJK");
		hm.put("Student5","LMN");
		System.out.println(hm);
		//hm1.put(null, null);
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}

}
