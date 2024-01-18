package Map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo3 {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(123, "Vardhan");
		ht.put(345, "shubham");
       System.out.println(ht);
       Set<Integer> keys = ht.keySet();
       Iterator<Integer> itr = keys.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       System.out.println("<<<<<<<entrySet>>>>>");
       Set<Map.Entry<Integer, String>> ent = ht.entrySet();
       Iterator itr1=ent.iterator();
       while(itr1.hasNext()) {
    	   System.out.println(itr1.next());
       }
       
       System.out.println("<<<<<<<<For-Each>>>>");
       for(Map.Entry<Integer, String> e:ent) {
    	   System.out.println("Key:"+e.getKey()+"Value:"+e.getValue());
       }
       
       System.out.println("<<<<<<<Values Method>>>>>>>");
       
       Collection<String> vals = ht.values();
       for(String i:vals) {
    	   System.out.println(i);
       }
       
	}

}



