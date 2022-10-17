package opps;
import java.util.*;

public class HashMap_PutIfabsent 
{

	public static void main(String[] args) 
	{
	HashMap<String, Object> h =new HashMap<String,Object>();
	h.put("Name", "Hemanth");
	h.put("Age", 25);
	h.put("Phno", null);
	h.put("Place", null);
	System.out.println(h);
	System.out.println(h.keySet());
	System.out.println(h.values());
	System.out.println(h.entrySet());
	h.putIfAbsent("Place", "Banglore");
	h.putIfAbsent("Phno", 25478522);
	System.out.println(h);
	
	}

}
