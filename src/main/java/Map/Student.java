package Map;

import java.util.Objects;

public class Student {
	private int Number;
	private String Name;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int number, String name) {
		super();
		Number = number;
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [Number=" + Number + ", Name=" + Name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, Number);
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
		return Objects.equals(Name, other.Name) && Number == other.Number;
	}
	
	

}
