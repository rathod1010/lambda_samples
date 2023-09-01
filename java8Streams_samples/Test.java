package java8Streams_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(23);
		list.add(30);
		list.add(45);
		list.add(50);
		list.add(55);
		list.add(98);
		System.out.println(list);
		System.out.println("======================");
		
		List<Integer> l = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers are :"+l);
		
		List<Integer> l2 = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("========================");
		System.out.println(l2);
		
		
	}

}
