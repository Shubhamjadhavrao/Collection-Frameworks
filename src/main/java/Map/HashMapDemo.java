package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
	
	HashMap<String, Integer> hs = new HashMap<>();
	hs.put("Shubhm", 28);
	hs.put("Vardhan", 14);
	hs.put("DDD", 123);
	hs.put("EEE", 123);
	
	System.out.println(hs.put("Shubham", 12));
	hs.put("QQQ", 123);
	hs.put("VVV", 123);
	hs.put("ZZZ", 123);
	hs.put("XXX", 123);

	
	System.out.println(hs);
	
	
   
	}
}
