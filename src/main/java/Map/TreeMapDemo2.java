package Map;

import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		String s1 = "Shubham";

		StringBuffer s2 = new StringBuffer("BBB");
		StringBuilder s3 = new StringBuilder("CCC");
		TreeMap tree = new TreeMap<>();

		tree.put(s1, 33);
		tree.put(s2, 22);
		tree.put(s3, 11);

		System.out.println(tree);

	}

}
