package function_samples;

import java.util.function.Function;

public class FunctionChain {
	
	public static void main(String[] args)
	{
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String,String> f2= s->s.substring(0,9);
		System.out.println(f1.apply("Rajkumar rathod"));
		System.out.println(f2.apply("Rathod Rajkumar"));
		
		System.out.println(f1.andThen(f2).apply("Rathod Rajkumar"));
		System.out.println(f1.compose(f2).apply("rathod rajkumar"));
	}

}
