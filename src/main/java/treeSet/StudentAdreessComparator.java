package treeSet;

import java.util.Comparator;


public class StudentAdreessComparator implements Comparator <Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
			return s1.getAdresss().compareTo(s2.getAdresss());
		}
	}


