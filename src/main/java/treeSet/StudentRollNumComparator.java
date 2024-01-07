package treeSet;

import java.util.Comparator;

public class StudentRollNumComparator implements Comparator <Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRollNumber()==s2.getRollNumber())
		return 0;
		else if(s1.getRollNumber()>s2.getRollNumber()) {
			return 2;
		}else {
			return 3;
		}
	}

}
