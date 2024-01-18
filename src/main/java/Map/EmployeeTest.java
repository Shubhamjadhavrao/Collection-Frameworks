package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeTest {
	public static void main(String[] args) {
		Map<Integer, Employee> em = new LinkedHashMap<Integer, Employee>();
		Employee em1 = new Employee(28, "Ram", "Pune", 123000.0);
		Employee em2 = new Employee(22, "Raj", "mumbai", 14530.0);
		Employee em3 = new Employee(21, "Shubham", "A.nagar", 56200.0);
		Employee em4 = new Employee(29, "Vardhan", "Pune", 533000.0);

		em.put(1, em1);
		em.put(2, em2);
		em.put(3, em3);
		em.put(4, em4);

		System.out.println();
		for (Map.Entry<Integer, Employee> map : em.entrySet()) {
			int key = map.getKey();
			Employee e = map.getValue();
			System.out.println(key + "Employee Details:");
			System.out.println("id:" + e.id + " " + "Name:" + e.Name + " " + "Address:" + e.Address + " " + "Salary:" + e.salary);
		}

	}
}