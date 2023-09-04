package streams_coding_samples;

import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,6,4);
		
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		
		System.out.println("Average of all numbers is "+avg);
	}

}
