package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo2 {
   public static void main(String[] args) {
	LinkedList li=new LinkedList<>();
	
	li.add(1234);
	li.add("Hello");
	li.add(1234);
	li.add(null);
	
	
	System.out.println("originalList:"+li);
	
	li.addFirst("Shubham");
	li.addLast("AAAA");
	
	System.out.println("LinkedList"+li);
	
	System.out.println(li.element());
	
	System.out.println("After element:"+li);
	
	System.out.println(li.getFirst());
	System.out.println(li.getLast());
	
	li.offer("ZZZ");
	System.out.println("After offer:"+li);
}
}
