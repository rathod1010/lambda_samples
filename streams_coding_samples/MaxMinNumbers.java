package streams_coding_samples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,44,5,8,9,32);
		
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("max number is : "+max);
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("min number is : "+min);
	}

}
