package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Shubham", 28);
		map.put("Vardhan", 14);
//		map.put("DDD", 123);
//		map.put("EEE", 123);
		//Searching
		if(map.containsKey("Shubham"))
			System.out.println("Key is Presnt in HashMap");
		else
			System.out.println("Key is Not Presnt in HashMap");
		
		//Iteration 1
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//Iteration
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		
		
		map.remove("EEE");
		System.out.println(map);
		

	}
}
