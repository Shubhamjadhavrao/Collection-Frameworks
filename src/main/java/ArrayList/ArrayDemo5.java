package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDemo5 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	     
	    al.add(123);
	    al.add("Hello JAVA");
	    al.add(345);
	    al.add("hi");
	    
	    
	    Iterator itr = al.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	     System.out.println(">>>>>>>>>>>");
	     ListIterator ltr =al.listIterator(2);
	     while(ltr.hasPrevious()) {
	    	 System.out.println(ltr.previous());
	     }
	 
	}


}
