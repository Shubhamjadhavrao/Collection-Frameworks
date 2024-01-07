package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorEnumration {

	public static void main(String[] args) {

		Vector vector = new Vector<>();

		vector.add("AAA");
		vector.add("BBB");
		vector.add("CCC");
		vector.add("DDD");
		vector.add("EEE");

//		Iterator itr = vector.iterator();
//
//		while (itr.hasNext()) {
//			String exp = (String) itr.next();
//
//			if (exp.equals("AAA")) {
//				itr.remove();
//				vector.remove(2);
//			}
//
//			ListIterator ltr = vector.listIterator();
//
//			while (ltr.hasNext()) {
//				String exp1 = (String) ltr.next();
//				if (exp1.equals("CCC")) {
//					ltr.remove();
//
//				}

				Enumeration enumeration = vector.elements();

				while (enumeration.hasMoreElements()) {
					String str = (String) enumeration.nextElement();
					if (str.equals("CCC")) {
						vector.add("QQQ");
						vector.remove(2);
					}

				}

				System.out.println(vector);
			}

		}
	

