package streams_realtime_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee(100, "raj", 30, 20000));
		employeeList.add(new Employee(200, "Pichai", 25, 50000));
		employeeList.add(new Employee(300, "Larry", 30, 450000));
		employeeList.add(new Employee(400, "Page", 19, 450000));
		
		//list 
		List<String> namesList = employeeList.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(namesList);
		
		//set
		
		Set<String> namesSet = employeeList.stream().map(e->e.getName()).collect(Collectors.toSet());
		System.out.println(namesSet);
		
		//young people
		
		List<Employee> youngPeople = employeeList.stream().filter(emp->emp.getAge()<30).collect(Collectors.toList());
		System.out.println(youngPeople);
		
		//filter employee older than 25
		
		List<Employee> olderThan25 = employeeList.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList());
		System.out.println("employees older than 25 "+olderThan25);
		
		
		//average of salary
		double avgSalary = employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println("Average salary :"+avgSalary);
		
//		  Map<Integer, List<Employee>> employeesByAge = employeeList.stream()
//	                .collect(Collectors.groupingBy(Employee::getAge));
//	        System.out.println("Employees grouped by age: " + employeesByAge);

	}

}
