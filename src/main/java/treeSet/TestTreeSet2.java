package treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();
		
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		
		System.out.println(set);
		
		System.out.println(set.subSet(20, 50));
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		
		System.out.println("Sorted Set Headset: "+set.headSet(70));
		System.out.println(set.tailSet(70));
		
		System.out.println("NavigableSet HeadSet:"+set.headSet(70, false));
		 System.out.println("NavigableSet Heigher:"+set.higher(50));
		 System.out.println("Navigable Set Lower:"+set.lower(30));
		 
		 System.out.println("NavigableSet Ceiling:"+set.ceiling(20));
		 
		 System.out.println("NavigableSet Floor:"+set.floor(20));
		System.out.println("<<<<<<<<Iterator>>>>>>>");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("<<<<<<<<decendingIterator>>>>>>>");
		
		Iterator itr1 = set.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("<<<<<<<<decendingSet>>>>>>>");
	    
		Set st = set.descendingSet();
		System.out.println(st);
		
		System.out.println(set.pollFirst());
		System.out.println("After pollFirst():"+set);
		
		System.out.println(set.pollLast());
		System.out.println("After pollLast():"+set);
		
	}

}
