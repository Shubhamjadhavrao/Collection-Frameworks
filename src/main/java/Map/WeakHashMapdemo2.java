package Map;


import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapdemo2 {
	public static void main(String[] args) {

		WeakHashMap<Integer, String> map = new WeakHashMap<>();
		map.put(1, "AAAA");
		map.put(2, "BBBB");
		map.put(3, "CCCC");
		map.put(4, "DDDD");
		map.put(5, "EEEE");

		System.out.println(map);
		// Getting a value from the map
		String value = map.get(2);
		System.out.println(value);

		// Checking if a key or value present in the map
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("AAAA"));

		// Removing an entry
		map.remove(2);
		System.out.println(map);

		// Finding map size
		System.out.println("Size of WeakHashMap: " + map.size());

//      Iterating over the map
		for (Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}

}
