package ComplexCollection;

public class Student {
	private int rollNumber;
	private String name;
	private String Adrress;
	
	public Student(int rollNumber, String name, String adrress) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		Adrress = adrress;
	}



	public int getRollNumber() {
		return rollNumber;
	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public String getAdrress() {
//		return Adrress;
//	}


//	public long getMarks() {
//		return Marks;
//	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", Adrress=" + Adrress 
				+ "]";
	}
	
	

}
