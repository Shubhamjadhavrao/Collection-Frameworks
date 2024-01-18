package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class InterateHashMapMultipleWay {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("AAA", 1);
		hm.put("BBB", 2);
		hm.put("CCC", 3);
		hm.put("DDD", 4);
		
		System.out.println(hm);
		
		wayOneItrate(hm);
		wayTwoItrate(hm);
		wayThreeItrate(hm);
		
		
	}

	public static void wayThreeItrate(HashMap<String, Integer> hm) {
		//Iterate on For Each
		System.out.println("Way3:For Each On value");
		for(Integer val : hm.values()) {
			System.out.println(val);
		}
		
	}

	public static void wayTwoItrate(HashMap<String, Integer> hm) {
		// Iterate on Entry set
		System.out.println("Way 2: Iterate on Entry Set");
		Set<Map.Entry<String , Integer>> ent = hm.entrySet();
		Iterator<Map.Entry<String, Integer>> itr1 = ent.iterator();
		while(itr1.hasNext()) {
			Map.Entry<String, Integer> entry= itr1.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
		System.out.println("<<<<<<<>>>>>>");
	}
          
	public static void wayOneItrate(HashMap<String, Integer> hm) {
		// Iterater on Keyset
		System.out.println("Way 1: Iterate on Key Set");
		Set<String> keyset = hm.keySet();
		Iterator<String> itr = keyset.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println("Key: "  +  key  +  " Value: "  +  hm.get(key));
		}
		
		System.out.println("<<<<<<<>>>>>>");
	}

}
