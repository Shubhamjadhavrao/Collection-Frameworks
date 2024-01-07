package Set;

import java.util.Objects;

public class Student {
	private int rollNumber;
	private String name;
	public Student() {
		super();
		
	}
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	
	

}
