package ArrayList;

import java.util.ArrayList;

public class ArrayDemo2 {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    
	    int i=123;
	    float f=12.4f;
//	    Student s1 = new Student(10,"Ram");
	    
	    al.add(i);
	    al.add("hello");
	    al.add(f);
	    al.add(null);
//	    al.add(s1);
	    al.add("hello");
	    
	    

		System.out.println("Size : "+al.size());
		System.out.println(al);
	}


}
