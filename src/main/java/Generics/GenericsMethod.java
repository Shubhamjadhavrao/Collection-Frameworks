package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
	public static <T> List<T> convertArrayToList(T[] arr) {
		List<T> lt = new ArrayList<T>();
		for (T a : arr)
			lt.add(a);

		return lt;

	}

	public static void main(String[] args) {
		Integer[] nums = { 10, 20, 30, 40, 50, 60 };

		System.out.println(convertArrayToList(nums));

		List<Integer> res = convertArrayToList(nums);

		for (Integer n : res) {
			Integer x = n;
		}
		String[] words = { "AAAA", "BBB", "CCCC", "DDDD" };

		List<String> listOfword = convertArrayToList(words);
		System.out.println(listOfword);
	}
}
