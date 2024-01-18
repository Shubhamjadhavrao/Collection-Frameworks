package Generics;

import java.util.LinkedList;
import java.util.List;import javax.swing.text.html.parser.Element;

public class LowerUpperBound {
//	Lower Bound 
	public static void printList(List<?super Number>list) {
		for(Object elem:list)
			System.out.println(elem+"");
		System.out.println();
		
	}
//	Upper Bound
	public static void printList2(List<?extends Number>list) {
		for(Object elem:list)
			System.out.println(elem+"");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		List<Object> obj = new LinkedList<Object>();
		obj.add(123);
		obj.add(null);
		obj.add(234);
		
		printList(obj);
		
		List<Integer> obj1 = new LinkedList<Integer>();
		
		obj1.add(34);
		obj1.add(null);
		obj1.add(43);
		
		printList2(obj1);
		
	}

}
