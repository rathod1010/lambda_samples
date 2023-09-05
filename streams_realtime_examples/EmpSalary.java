package streams_realtime_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpSalary {
	
	public static void main(String[] args)
	{
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(100, "raj", 30, 20000));
		employeeList.add(new Employee(200, "Pichai", 25, 50000));
		employeeList.add(new Employee(300, "Larry", 30, 450000));
		employeeList.add(new Employee(400, "Page", 19, 450000));
		
		List<Employee> filteredEmployees = employeeList.stream()
		        .filter(emp -> emp.getAge() > 25 && emp.getSalary() > 30000)
		        .collect(Collectors.toList());
		
		System.out.println(filteredEmployees);

	}

}
