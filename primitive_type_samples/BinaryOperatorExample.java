package primitive_type_samples;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {
	
	public static void main(String[] args)
	{
		BiFunction<String,String,String> f = (s1,s2)->s1+s2;
		System.out.println(f.apply("raj", "kumar"));
		
		BinaryOperator<String> f1 =(s1,s2)->s1+s2;
		System.out.println(f1.apply("rathod", "raj"));
		
		IntBinaryOperator f2 =(a,b)->a+b;
		System.out.println(f2.applyAsInt(3, 5));
	}

}
