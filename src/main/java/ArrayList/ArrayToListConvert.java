package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayToListConvert {
	public static void main(String[] args){
		Integer[] nums = {10,20,30,40,50,60,70,80,90};
		
		List al=Arrays.asList(nums);
		System.out.println(al);
		Object[] numsConvert=al.toArray(new Integer[0]);
		System.out.println(Arrays.toString(numsConvert));
		
		for(Object o:numsConvert)
			System.out.println((Integer)o+10);
	}
}
