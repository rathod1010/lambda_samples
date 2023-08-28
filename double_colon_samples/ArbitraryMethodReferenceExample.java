package double_colon_samples;

import java.util.Arrays;
import java.util.List;

public class ArbitraryMethodReferenceExample {
	
	public static void main(String[] args)
	{
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		 
		 names.forEach(String::toUpperCase);
		 System.out.println(names);
	}

}
