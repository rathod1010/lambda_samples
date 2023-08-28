package double_colon_samples;

import java.util.Arrays;
import java.util.List;

public class ClassMethodReferenceExample {
	
	public static void main(String[] ars)
	{
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(System.out::println);
	}

}
