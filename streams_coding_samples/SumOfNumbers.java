package streams_coding_samples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		Optional<Integer> sum= list.stream().reduce((x,y)->x+y);
		
		System.out.println("The sum of all the number is :"+sum.get());
	}

}
