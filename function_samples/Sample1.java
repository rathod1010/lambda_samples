package function_samples;

import java.util.function.Function;

public class Sample1 {

	public static void main(String[] args)
	{
		Function<String,Integer> f = s->s.length();
		
		System.out.println(f.apply("rajkumar"));
		System.out.println(f.apply("kumar"));
		System.out.println(f.apply("raj"));
		
	}
}
