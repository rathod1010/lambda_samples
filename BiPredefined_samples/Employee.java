package BiPredefined_samples;

import java.util.function.BiFunction;

public class Employee {
	
	int eno;
	String name;
	double dailyWage;
	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
	
	public static void main(String[] args)
	{
		BiFunction<Employee,Timesheet,Double> f = (e,t)->e.dailyWage*t.days;
		Employee e = new Employee(101,"Rajkumar",1000);
		Timesheet t = new Timesheet(101,25);
		System.out.println("Employee Monthly Salary : "+f.apply(e, t));
	}
	
	

}

class Timesheet
{
	int eno;
	int days;
	public Timesheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}
	
	
}

