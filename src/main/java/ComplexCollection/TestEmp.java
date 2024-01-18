package ComplexCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class TestEmp {
	
	public static void main(String[] args) {
		
		
		List<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(1, "AAAA", 100000.0, "IT");
		Employee emp2 = new Employee(2, "BBBB", 200000.0, "Sales");
		Employee emp3 = new Employee(3, "CCCC", 500000.0, "Marketing");
		Employee emp4 = new Employee(4, "DDDD", 600000.0, "HR");
		
		
		
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		System.out.println(list);
		System.out.println();
		Employee emp = TestEmp.findSeconHighestSalariedEmployee(list);
		Employee cmp = TestEmp.findSeconSmalestSalariedEmployee(list);
		System.out.println();
		System.out.println("SecondHigheistSalary:"+emp);
		System.out.println();
		System.out.println("SecondSmallesrtSalary:"+cmp);
	}

	public static Employee findSeconHighestSalariedEmployee(List<Employee> list) {
	 
		{
			
			Comparator<Employee> com = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee e1, Employee e2) {
					if(e1.getSalary()<e2.getSalary())
					    return 1;
					else if(e1.getSalary()>e2.getSalary())
					   return -1;
					return 0;
				}
			};
			
			Collections.sort(list,com);
			System.out.println(list);
			return list.get(1);
			
			   
	}
		
		

	

}

	public static Employee findSeconSmalestSalariedEmployee(List<Employee> list) {
		Comparator<Employee> cm = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary()<e2.getSalary())
				   return 1;
				else if(e1.getSalary()>e2.getSalary())
					return -1;
				return 0;
			}
		};
		
		Collections.sort(list,cm);
		System.out.println(list);
		return list.get(2);
		
	}
}



