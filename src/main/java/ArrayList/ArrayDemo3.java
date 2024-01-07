package ArrayList;

import java.util.ArrayList;

public class ArrayDemo3 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    
	    System.out.println("empty:"+al.isEmpty());
	    al.add("Shubham");
	    al.add(123);
	    
	    System.out.println(al.add("Hello"));
	    System.out.println(al);
	    System.out.println("isempty:"+al.isEmpty());
	    
	    
	    ArrayList a1=new ArrayList();
	     a1.addAll(al);
	     a1.add(1234);
	     a1.add(321);
	     System.out.println(a1);
	     System.out.println(a1.remove("hi"));
	     
	     a1.removeAll(al);
	     a1.retainAll(al);
	     
	     System.out.println(a1.contains("hello"));
	     System.out.println(a1.retainAll(al));
	     System.out.println(a1);
	     
	     a1.clear();

			System.out.println("After clear : "+a1);
			
			System.out.println();

}
}
