package double_colon_samples;

import java.util.function.Function;

public class StaticMethodReferenceExample {
	
	public static void main(String[] args)
	{
		//lambda expresiion 
		
		Function<String,Integer> parseInt = s->Integer.parseInt(s);
		
		//Method reference
		
		Function<String,Integer> parseIntRef = Integer ::parseInt;
		
		int result = parseIntRef.apply("42");
		System.out.println(result);
	}

}
