package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayToListConvert2 {
	public static void main(String[] args){
		ArrayList<String> name = new ArrayList<>();
		
		name.add("AAA");
		name.add("BBB");
		name.add("CCC");
		name.add("DDD");
		
		String[] name2=name.toArray(new String[0]);
		System.out.println(Arrays.toString(name2));
		
		ArrayList<Integer> al =new ArrayList<>();
		
		al.add(123);
		al.add(234);
		al.add(123);
		
		System.out.println("ArrayList:"+al);
		
		Integer[] nums=al.toArray(new Integer[0]);
		System.out.println(Arrays.toString(nums));

			
	}
}
