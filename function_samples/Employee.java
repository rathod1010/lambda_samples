package function_samples;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {
	
	String name;
	double salary;
	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args)
	{
		
		ArrayList<Employee> list = new ArrayList<>();
		populate(list);
		
		Function<ArrayList<Employee>,Double> f = l->{
			double total =0;
			
			for(Employee e:l)
			{
				total=total+e.salary;
			}
			return total;
		};
		
		System.out.println("The total salary of all employees is :"+f.apply(list));
		
		
		System.out.println("Before increment");
		System.out.println(list);
		
		Predicate<Employee> p = e->e.salary<25000;
		Function<Employee,Employee> f1 = e->
		{
			e.salary=e.salary+500;
			return e;
		};
		
		ArrayList<Employee> l2 = new ArrayList<>();
		
		for(Employee e :list)
		{
			 if(p.test(e))
			 {
				 f1.apply(e);
				 l2.add(e);
			 }
		}
		
		System.out.println("After increment");
		System.out.println(l2);
		
		
	}
	
	public static void populate(ArrayList<Employee> list)
	{
		list.add(new Employee("raj", 20000));
		list.add(new Employee("kumar", 30000));
		list.add(new Employee("rajkumar", 10000));
		list.add(new Employee("tahod", 23000));
		list.add(new Employee("rathod", 29000));
	}

}
