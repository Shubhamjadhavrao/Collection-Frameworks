package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GetKeyByValue {

	static HashMap<String, Integer> hm = new HashMap<>();
	public static void main(String[] args) {
		
		System.out.println(hm.put("AAA", 123));
		System.out.println(hm.put("BBB", 789));
		System.out.println(hm.put("CCC", 456));
		System.out.println(hm.put("DDD", 123));
		System.out.println(hm);
		
		System.out.println(hm);
		
		String key = getKey(456);
		System.out.println("key for given value is:"+key);
	}

	public static String getKey(int i) {
		String key = null;
		if (hm.containsValue(i)) {
			Set<Map.Entry<String, Integer>> entris = hm.entrySet();
			for (Map.Entry<String, Integer> entry : entris) {
				if (entry.getValue() == i) {

					key = entry.getKey();
					break;
				}

			}
		} else {
			System.out.println("Invalid Value");
		}
		return key;
	}

}
