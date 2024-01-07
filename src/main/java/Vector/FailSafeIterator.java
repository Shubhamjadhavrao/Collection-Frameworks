package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {

		Map<String, Integer> map = new ConcurrentHashMap();
		map.put("Ram", 1);
		map.put("Shyam", 2);
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
			map.put("Radhe", 3);
		}
		System.out.println("<<<<<<<<<>>>>>>");

		List list = new CopyOnWriteArrayList<>();

		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		list.add("EEE");

		Iterator ftr = list.iterator();

		while (ftr.hasNext()) {
			System.out.println(ftr.next());
			list.add("ZZZ");
		}

		System.out.println(list);
	}

}
