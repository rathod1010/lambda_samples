package predicate_samples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {

	String name;
	String designation;
	double salary;
	String city;


	
	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", Designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}



	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Rajkumar","ceo", 30000, "hyderabad");
		Employee e2 = new Employee("Kumar","engineer", 20000, "banglore");
		Employee e3 = new Employee("raj","support", 33000, "banglore");
		Employee e4 = new Employee("rathod","manager", 22000, "kolkota");
		Employee e5 = new Employee("bunny","engineer", 28000, "pune");
		list.add(e1);
		list.add(e2);
		list.add(e5);
		list.add(e4);
		list.add(e3);
		System.out.println(list);
		
		
		System.out.println("==============================================");
		
		Predicate<Employee> p1 =  emp->emp.designation.equals("engineer");
		display(p1,list);
		System.out.println("==============================================");
		
		Predicate<Employee> p2 = emp->emp.city.equals("banglore");
		display(p2,list);
		
		System.out.println("==============================================");
		
		Predicate<Employee> p3 = emp->emp.salary<25000;
		display(p3,list);
	}
	
	

	public static void display(Predicate<Employee> p , ArrayList<Employee> list)
	{
		for(Employee e : list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}
}
