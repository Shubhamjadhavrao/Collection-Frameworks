package ArrayList;

import java.util.ArrayList;

public class ArrayDemo4 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	     
	    al.add(123);
	    al.add("Hello JAVA");
	    
	    System.out.println(al);
	    
	    ArrayList al2=new ArrayList();
	    
	    al2.add(123);
	    al2.add("Hello JAVA");
	    
	    System.out.println(al2);
	    
	    System.out.println(al.hashCode());
	    System.out.println(al2.hashCode());
	    
	    System.out.println(al.equals(al2));
	 
	}


}
