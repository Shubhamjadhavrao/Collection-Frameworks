package treeSet;

import java.util.Comparator;
import java.util.Objects;

public class Student {

	private int rollNumber;
	private String name;
	private String addresss;

	public Student() {
		super();

	}

	public Student(int rollNumber, String name, String adresss) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.addresss = adresss;
	}

	

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresss() {
		return addresss;
	}

	public void setAdresss(String adresss) {
		this.addresss = adresss;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", adresss=" + addresss + "]";
	}

	
}
