package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(231);
		lhs.add("AAA");
		lhs.add("BBB");
		lhs.add("CCC");
		lhs.add("AAA");
		lhs.add(null);
		lhs.add(231);
		
		System.out.println(lhs);
	}
}
