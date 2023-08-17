package predicate_samples;

import java.util.function.Predicate;

//to implement conditional checking we have to go for predication function

public class Test2 {

	public static void main(String[] args)
	{
		Predicate<String> p = s->s.length()>5;

		
		System.out.println(p.test("rajkumar"));
		System.out.println(p.test("raj"));
	}
}
