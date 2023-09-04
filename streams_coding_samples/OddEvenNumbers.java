package streams_coding_samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,23,33,44,56,78,40);
		
		List<Integer> evenList = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		List<Integer> oddList = numbers.stream().filter(e->e%2==1).collect(Collectors.toList());
		
		System.out.println(oddList);
	}

}
