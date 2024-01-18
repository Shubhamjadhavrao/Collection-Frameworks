package Map;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("AAA", 123);
		ht.put("BBB", 234);
		ht.put("CCC", 123);
		ht.put("DDD", 455);
		System.out.println(ht.put("AAA", 321));
		ht.put("EEE",567 );
		ht.put("FFF",199 );
		
		System.out.println(ht);
	}

}
