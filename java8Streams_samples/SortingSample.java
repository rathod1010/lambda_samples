package java8Streams_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingSample {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(22);
		list.add(15);
		
		System.out.println(list);
		System.out.println("=========================");
		List<Integer> sortedList =list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("=========================");
		List<Integer> sortList = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortList);
	
	}
}
