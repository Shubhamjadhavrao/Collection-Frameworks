package treeSet;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		
		String s1="AAA";
		String s12="BBB";
		String s13="SSS";

		StringBuffer s4 = new StringBuffer("ZZZ");
		StringBuffer s5= new StringBuffer("DDD");
		
		set.add(s13);
		set.add(s12);
		set.add(s1);
		set.add(s12);
//		set.add(null);// null allowed 
		
		System.out.println(set);
		
		
		
	}
}