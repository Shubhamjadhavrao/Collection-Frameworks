package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod2 {
	public static List convertArrayToList(int[] arr) {
		List lt = new ArrayList<>();
		   for(int a:arr)
			   lt.add(a);
		
		return lt;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60};
		
		System.out.println(convertArrayToList(nums));
		
		List res = convertArrayToList(nums);
		
		for(Object n:res) {
			 Integer x =(Integer) n;
		}
		
//		String[] words = {"AAAA","BBB","CCCC","DDDD"};
//		
//		List<String> listOfword=convertArrayToList(words);
//		
//		System.out.println(listOfword);
	}

}
