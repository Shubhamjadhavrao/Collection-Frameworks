package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayCostructor {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);

		System.out.println("ArrayList al : " + al);

		HashSet hs = new HashSet(al);

		System.out.println(hs);

		ArrayList al2 = new ArrayList(hs);
		System.out.println(al2);

	}
}
