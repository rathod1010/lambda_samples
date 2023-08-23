package BiPredefined_samples;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Student {
	
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<>();
		BiFunction<String,Integer,Student> f = (name,rollno)->new Student(name,rollno);
		list.add(f.apply("rajkumar", 22));
		list.add(f.apply("kumar", 66));
		list.add(f.apply("rathod", 33));
		
		for(Student s : list)
		{
			System.out.println("name:"+s.name);
			System.out.println("rollno :"+s.rollno);
		}
		
	}

}
