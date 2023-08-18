package function_samples;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {

	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args)
	{
		
		ArrayList<Student> list = new ArrayList<>();
		populate(list);
		
		Function<Student,String> f = s->{
			int marks=s.marks;
			if(marks>=80)
			{
				return "A[Distinction]";
			}
			else if(marks>=60)
			{
				return "B[Distinction]";
			}
			else if(marks>=40)
			{
				return "C[Distinction]";
			}
			else
			{
				return "failed";
			}
		};
		
		for(Student s :list)
		{
			System.out.println("Name :"+s.name);
			System.out.println("marks :"+s.marks);
			System.out.println("Grade :"+f.apply(s));
		}
		
		System.out.println("==============================");
		
		Predicate<Student> p = s->s.marks>=60;
		for(Student s : list)
		{
			if(p.test(s))
			{
				System.out.println("NAME :"+s.name);
				System.out.println(("MARKS : "+s.marks));
				System.out.println("GRADE : "+f.apply(s));
			}
		}
		
	}

	public static void populate(ArrayList<Student> list) {
		list.add(new Student("Raj", 20));
		list.add(new Student("kumar", 88));
		list.add(new Student("Rajkuar", 77));
		list.add(new Student("rathod", 50));
		list.add(new Student("kum", 65));

	}

}
