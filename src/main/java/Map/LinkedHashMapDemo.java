package Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Shubham", 28);
		lhm.put("Ram", 1);
		lhm.put("spidar", 12);
		lhm.put("vardhan", 34);
		
		System.out.println(lhm);
		
		for(Map.Entry ent :lhm.entrySet() ) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

}
