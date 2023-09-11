package optional_samples;

import java.util.Optional;

public class OptionalExample2 {
	
	public static void main(String[] args)
	{
		String[] str = new String[10];
		
		str[3]="JAVA FEATURES ";
		
		Optional<String> checkNull = Optional.ofNullable(str[3]);
		
		checkNull.ifPresent(System.out::println);
		
		System.out.println(checkNull.get());
		
		System.out.println(str[3].toLowerCase());
		
	}

}
