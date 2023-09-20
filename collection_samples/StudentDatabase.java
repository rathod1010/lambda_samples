package collection_samples;

import java.util.ArrayList;

public class StudentDatabase {

	public static void main(String[] args)
	{
		ArrayList<Student> students = new ArrayList<>();
		
		 students.add(new Student("Raj",20));
		 students.add(new Student("kumar",21));
		 students.add(new Student("rajkumar",22));
		 students.add(new Student("rathod",24));
		 students.add(new Student("rat",33));
		 
		 for(Student student :students)
		 {
			 if(student.getName().equals("kumar"))
			 {
				 student.setAge(22);
				 break;
			 }
		 }
		 
		 
		// Removing a student from the database
		 
		 students.removeIf(student -> student.getName().equals("rat"));
		 
		 for(Student student : students)
		 {
			 System.out.println("name : "+student.getName()+ " , age :"+student.getAge());
		 }

	}
}
