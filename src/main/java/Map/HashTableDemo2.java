package Map;

import java.util.Hashtable;

public class HashTableDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(10, "Ram");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Hashtable<Student, String> ht = new Hashtable<>();
		ht.put(s1, "Vardhan");
		ht.put(s2, "shubham");
       
		System.out.println(ht);
	}

}
