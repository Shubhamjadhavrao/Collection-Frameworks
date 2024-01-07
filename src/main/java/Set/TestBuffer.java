package Set;

import java.util.HashSet;

public class TestBuffer {
	public static void main(String[] args) {

		HashSet hs = new HashSet();

		String s1 = "Hello";

		String s2 = new String("Hello");

		System.out.println("S1 hashCode:" + s1.hashCode());
		System.out.println("s2 hashCode:" + s2.hashCode());

		StringBuffer s3 = new StringBuffer("Hello");
		StringBuffer s4 = new StringBuffer("Hello");
		StringBuffer s5 = new StringBuffer("Hello");
		StringBuffer s6 = new StringBuffer("Hello");

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);

		System.out.println(hs);

	}

}
