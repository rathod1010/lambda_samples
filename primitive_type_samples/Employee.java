package primitive_type_samples;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class Employee {
	
	String name;
	double salary;
	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		
		ObjDoubleConsumer<Employee> c = (e,d)->e.salary=e.salary+d;
		for(Employee e:list)
		{
			c.accept(e,500.0);
		}
		
		for(Employee e :list)
		{
			System.out.println("Employee name :"+e.name);
			System.out.println("Employee salary :"+e.salary);
			System.out.println("=========================");
		}
	}
	
	public static void populate(ArrayList<Employee> list)
	{
		list.add(new Employee("raj",1000 ));
		list.add(new Employee("kumar", 2000));
		list.add(new Employee("rathod", 4000));
		list.add(new Employee("rathod", 4400));
	}
	
	

}
