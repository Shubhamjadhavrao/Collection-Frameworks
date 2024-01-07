package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteratorDemo {
	public static void main(String[] args) throws Exception {
		ArrayList al1 = new ArrayList();

		al1.add("AAA");
		al1.add("BBB");
		al1.add("CCC");
		al1.add("DDD");
		al1.add("FFF");

		Iterator itr = al1.iterator();
		while(itr.hasNext()) {
               
		}
		System.out.println(al1);

	}
}
