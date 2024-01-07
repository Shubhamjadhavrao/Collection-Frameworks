package ArrayList;

import java.util.ArrayList;

public class ArrayDemo {
      public static void main(String[] args) {
	    ArrayList al = new ArrayList();
	    
	    al.add(123);
	    al.add(123);
	    al.add(123);
	    al.add(123);
	    al.add(123);
	    
//	    System.out.println("Initial Capacity : "+getCapacity(al)); //==Ten
		System.out.println("Size : "+al.size());
	}

//	public static String getCapacity(ArrayList al) {
//		Field dataField = ArrayList.class.getDeclaredField("elementData");
//        dataField.setAccessible(true);
//        return ((Object[]) dataField.get(l)).length;
//		
//	}
}
