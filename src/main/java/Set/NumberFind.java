package Set;

import java.util.HashSet;
import java.util.Iterator;

public class NumberFind {
	public static void main(String[] args) {
		
		HashSet hs =new HashSet<>();
		
		hs.add(5);
		hs.add(4);
		hs.add(8);
		
//		Iterator itr = hs.iterator(10);
		
		for(int i=0;i<=10;i++) {
			if(hs.contains(i)) {
				System.out.println(hs+"number found");
			}else {
				System.out.println(hs+"number not found");
			}
		}
	}

}
