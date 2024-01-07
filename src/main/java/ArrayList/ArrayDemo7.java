package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayDemo7 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	     
	    al.add(123);
	    al.add("Hello JAVA");
	    al.add(345);
	    al.add("hi");
	    al.add(2);
	   
	    
	    System.out.println(al);
	    
       List al1 = al.subList(0, 3);
       
       System.out.println(al1);
       al.remove("hi");
       System.out.println(al);
	    

}
}
