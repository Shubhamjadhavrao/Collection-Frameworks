package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
   public static void main(String[] args) {
	LinkedList li=new LinkedList<>();
	
	li.add(1234);
	li.add("Hello");
	li.add(1234);
	li.add(null);
	
	
	System.out.println(li);
	
	System.out.println(li.get(0));
	
	System.out.println(">>>>>><<>>><<>>");
	
	Iterator itr = li.descendingIterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	System.out.println("<<<<<<<>><<><><>>");
	
	ListIterator ltr = li.listIterator(3);
	
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
}
}
