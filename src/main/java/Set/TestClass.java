package Set;

import java.util.HashSet;

public class TestClass {
	public static void main(String[] args) {

		Student std1 = new Student(10, "Ram");
		Student std2 = new Student(20, "sham");
		Student std3 = new Student(30, "nam");
		
		System.out.println(std1 == std3);
		System.out.println(std1.equals(std1));//if both value are same print true otherwise false.
		
		
		HashSet hs = new HashSet();
		
		hs.add(std1);
		hs.add(std2);
		hs.add(std3);
		
		
		System.out.println(hs);
	}

}
