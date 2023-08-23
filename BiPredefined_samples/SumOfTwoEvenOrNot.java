package BiPredefined_samples;

import java.util.function.BiPredicate;

public class SumOfTwoEvenOrNot {

	public static void main(String[] args)
	{
		BiPredicate<Integer,Integer> p= (a,b)->(a+b)%2==0;
		System.out.println(p.test(23, 30));
		System.out.println(p.test(22, 10));
				
				
    }

}
