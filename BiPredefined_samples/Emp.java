package BiPredefined_samples;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Emp {

	String name;
	double salary;
	
	
	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		BiFunction<String,Double,Emp> f = (name,salary)->new Emp(name, salary);
		list.add(f.apply("raj", 20000.0));
		list.add(f.apply("kumar", 10000.0));
		list.add(f.apply("rathod", 22000.0));
		
		BiConsumer<Emp,Double> c = (e,increment)->e.salary=e.salary+increment;
		
		for(Emp e: list)
		{
			c.accept(e, 500.0);
		}
		
		for(Emp e : list)
		{
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		
	}
	
	
}
