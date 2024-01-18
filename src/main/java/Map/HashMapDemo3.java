package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Shubham", 28);
		map.put("Vardhan", 14);
//		map.put("DDD", 123);
//		map.put("EEE", 123);
		
		Set<String> str = map.keySet();
		Iterator<String> itr = str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Map.Entry<String, Integer>> ent =map.entrySet();
		Iterator itr1 = ent.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("<<<<<<<<Values method>>>>>>");
		Collection<Integer> val  = map.values();
		for(Integer i:val)
		{
			System.out.println(i);
		}
	}
}
