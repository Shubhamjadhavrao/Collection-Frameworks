package treeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet3 {
	public static void main(String[] args) {

		Student std1 = new Student(20, "Sagar", "Rahata");
		Student std2 = new Student(21, "Shubham", "Puntamba");
		Student std3 = new Student(78, "Vardhan", "A.Nagar");

		TreeSet<Student> set = new TreeSet<>();

		set.add(std3);
		set.add(std1);
		set.add(std2);

		System.out.println(set);

	}

}
