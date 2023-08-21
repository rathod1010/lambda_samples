package consumer_samples;

import java.util.ArrayList;
import java.util.function.*;

public class Student {
	
	String name;
	int marks;
	
	
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}



	public static void main(String args[])
	{
		Predicate<Student> p = s->s.marks>=60;
		
		Function<Student,String> f = s->
		{
			int marks =s.marks;
			if(marks>=80)
			{
				return "A";
			}
			
			else if(marks>=60)
			{
				return "B";
			}
			
			else if(marks>=40)
			{
				return "C";
			}
			
			else
			{
				return "FAILED";
			}
		};
		
		Consumer<Student> c = s->
		{
			System.out.println("Name :"+s.name);
			System.out.println("marks :"+s.marks);
			System.out.println("Grade :"+f.apply(s));
		};
		
		ArrayList<Student> list = new ArrayList<>();
		populate(list);
		for(Student s:list)
		{
			c.accept(s);
		}
		
	}
	
	public static void populate(ArrayList<Student> list)
	{
		
		list.add(new Student("ram", 90));
		list.add(new Student("raj", 67));
		list.add(new Student("kumar", 88));
		list.add(new Student("rathod rajkumar",33));
		
	}

}
