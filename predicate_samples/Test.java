package predicate_samples;

import java.util.function.Predicate;

public class Test {
	
	public static void main(String[] args)
	{
		Predicate<Integer> p = s->s>10;
		System.out.println(p.test(16));
		System.out.println(p.test(5));
		
	}

}
