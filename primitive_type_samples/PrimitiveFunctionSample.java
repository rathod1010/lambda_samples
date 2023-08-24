package primitive_type_samples;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunctionSample {
	
	public static void main(String[] args)
	{
		Function<Integer,Integer> f =i->i*i;
		System.out.println(f.apply(10));
		
		
		IntFunction<Integer> f1 =i->i*i;
		System.out.println(f.apply(4));
		
	}

}
