package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector vector = new Vector<>();

		vector.add(1234);
		vector.add("shubham");
		vector.add("Ram");
		vector.add("Hii");
		vector.add("aaa");

		System.out.println("original List" +vector);
		System.out.println("<<<<Enumration>>>>>>><<");
		Enumeration emr = vector.elements();
		
		while(emr.hasMoreElements()) {
			System.out.println(emr.nextElement());
		}
		
		System.out.println("<<<<iterator>>>>");
		
		Iterator itr = vector.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("<<<<<ListIterator>>>>>");
		ListIterator ltr =vector.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		
	}

}
