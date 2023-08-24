package primitive_type_samples;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionSample2 {
	
	public static void main(String[] args)
	{
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("rajkumar"));
		
		ToIntFunction<String> f1 = s->s.length();
		System.out.println(f1.applyAsInt("raj"));
		
//		Function<Integer,Double> f2= i->Math.sqrt(i);
//		System.out.println(f.apply(5));
		
		IntToDoubleFunction f3 = i->Math.sqrt(i);
		System.out.println(f3.applyAsDouble(5));
		System.out.println(f3.applyAsDouble(6));
	}

}
