package ComplexCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class StudentTest {
	public static void main(String[] args) {
		List<Student> std =new ArrayList<>(); 
       
		Student std1= new Student(1, "Ram", "pune");
		Student std2=new Student(2, "Sham", "A.nagar");
		Student std3=new Student(3, "Shubham", "Puntamba");
		Student std4=new Student(4, "Vardhan", "A.nagar");
		
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);
		
		System.out.println("Original Lst:"+std);
		System.out.println();
		
		Student sdt =StudentTest.findSecondHighestRollNumber(std);
		System.out.println();
		System.out.println("SecondRollNumber in List:"+sdt);
		
	}

	public static Student findSecondHighestRollNumber(List<Student> std) {
	  Comparator<Student> com = new Comparator<Student>() {
		
		@Override
		public int compare(Student s1, Student s2) {
			if(s1.getRollNumber()<s2.getRollNumber())
			return 1;
			else if(s1.getRollNumber()>s2.getRollNumber())
			return -1;
			return 0;
		}
	};
	
	Collections.sort(std,com);
	System.out.println(std);
		return std.get(1);
	}

}
