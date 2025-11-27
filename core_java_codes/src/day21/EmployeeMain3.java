package day21;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain3 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(1, "Shruti", "Female");

		Employee2 e2 = e1;

		Employee2 e3 = new Employee2(1, "Shruti", "Female");
		Employee2 e4 = new Employee2(5, "Shruti", "Female");

		// This will compare reference and not values
		Set<Employee2> employees = new TreeSet<Employee2>();
		
		employees.add(e4);
		employees.add(e1);
		employees.add(e2); // compare hashCode repeated so skip
		employees.add(e3);
		
		employees.forEach(System.out::println);
	}

}
