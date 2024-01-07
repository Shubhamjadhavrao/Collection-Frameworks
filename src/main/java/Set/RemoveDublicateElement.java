package Set;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class RemoveDublicateElement {
	public static void main(String[] args) {
		Integer[] arr = {10,20,30,10,40,50,30,10};
		
		Integer[] unicElement=reomveDublicate(arr);
		
		System.out.println(Arrays.asList(unicElement));
	}

	public static Integer[] reomveDublicate(Integer[] arr) {
//		List<Integer> ls = Arrays.asList(arr);
//		HashSet<Integer> hs = new HashSet<>(ls);
//		Integer[] res = hs.toArray(new Integer[0]);
//		return res;
//		
		
//	-------Optimize 1------------		

//		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arr));
//		return hs.toArray(new Integer[0]);

//-------Optimize 2------------		
		
		
		return new HashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
	}

}
