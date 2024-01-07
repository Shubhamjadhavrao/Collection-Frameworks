package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
//		Stack is Lifo Structure
		Stack s = new Stack<>();
		
		s.push("AAA");
		s.push("BBB");
		s.push("CCC");
		s.push("DDD");
		s.push("EEE");
		s.push("FFF");
		
		System.out.println("A top Element:"+s.pop());
		System.out.println("Original Stack:"+s);
		
		System.out.println("A top Element:"+s.peek());
		System.out.println("Original Stack:"+s);
		
		System.out.println(s.empty());// it return boolean value
		System.out.println(s.search("BBB"));
		
	}

}
