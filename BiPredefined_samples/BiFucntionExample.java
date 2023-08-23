package BiPredefined_samples;

import java.util.function.BiFunction;

public class BiFucntionExample {
	
	public static void main(String[] args)
	{
		BiFunction<Integer,Integer,Integer> i = (a,b)->a*b;
		System.out.println("a*b = "+i.apply(10, 20));
		System.out.println("a*b = "+i.apply(11, 11));
		
	}

}
