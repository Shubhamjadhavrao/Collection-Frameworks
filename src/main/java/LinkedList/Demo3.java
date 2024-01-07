package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo3 {
   public static void main(String[] args) {
	LinkedList li=new LinkedList<>();
	
	li.add(1234);
	li.add("Hello");
	li.add(1234);
	li.add(null);
	
	
	System.out.println("originalList:"+li);
	
	System.out.println(li.peek());
	
	System.out.println("After peek()LinkedList"+li);
	
	System.out.println(li.pop());
	System.out.println("after pop linkedList:"+li);
	
	li.push("Shubham");
	System.out.println("After push:"+li);
	
	System.out.println(li.poll());
	System.out.println("After poll:"+li);
}
}
