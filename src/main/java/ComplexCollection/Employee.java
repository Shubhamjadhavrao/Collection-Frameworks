package ComplexCollection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	

	public double getSalary() {
		return salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
	
	

}
