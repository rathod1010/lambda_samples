package predicate_samples;

import java.util.function.Predicate;

public class Sample {
	
	public static void main(String[] args)
	{
		int[] x = {0,5,10,15,20,25,30};
		Predicate<Integer> p = i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		System.out.println("The number greater than 10 are as follows :");
		m1(p,x);
		
		System.out.println("the even numbers are :");
		m1(p2,x);
		
		System.out.println("the numbers not greater than 10 are :");
		m1(p.negate(),x);
		
		System.out.println("The numbers which are greater than 10 and also even number are as follows");
		m1(p.and(p2),x);
		
		System.out.println("The numbers which are greater than 10 or even are");
		m1(p.or(p2),x);
	}

	public static void m1(Predicate<Integer> p , int[] x)
	{
		for(int x1:x)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	}
}
