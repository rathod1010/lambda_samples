package streams_coding_samples;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		double avg = list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		
		System.out.println(avg);
		
		
	}

}
