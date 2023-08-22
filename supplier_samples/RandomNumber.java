package supplier_samples;

import java.util.function.Supplier;

public class RandomNumber {
	
	public static void main(String[] args)
	{
		Supplier<String> s = ()-> 
		{
			String[] s1 = {"sunny","bunny","minny","chinny"};
			int x = (int) Math.random()*4;
			return s1[x];
			
		};
		
		System.out.println(s.get());
	
	}

}
