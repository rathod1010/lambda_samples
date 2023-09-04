package streams_coding_samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(0,3,6,10,20,30,4,22);
		
	List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
	
	  System.out.println(sortedList);
	  
	 List<Integer> reverseOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	 
	 System.out.println(reverseOrder);
		
	}

}
