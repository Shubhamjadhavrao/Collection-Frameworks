package Map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> tree = new TreeMap<>();
		tree.put("shubham", 1);
		tree.put("Ram", 2);
		tree.put("sham", 3);
		tree.put("null", 4);//Null key not allowed in treeMap
		tree.put("BBB", null);//Null value  allowed in treeMap
		
		System.out.println(tree);
	}

}
