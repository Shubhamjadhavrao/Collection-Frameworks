package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDemo6 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	     
	    al.add(123);
	    al.add("Hello JAVA");
	    al.add(345);
	    al.add("hi");
	    al.add(2);
	    Integer s=2;
	    
	    System.out.println(al.get(0));
	    
//	    al.set(0, "Hello");
	    al.add(0, "Hiii");
	    System.out.println(al);
	    al.remove(s);
	    System.out.println("After remove:"+al);
	    
	    System.out.println(al.indexOf(345));
	    System.out.println(al.lastIndexOf(123));


}
}
