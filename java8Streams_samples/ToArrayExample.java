package java8Streams_samples;

import java.util.ArrayList;

public class ToArrayExample {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(22);
		list.add(15);
		
		Integer[] arr = list.stream().toArray(Integer[]::new);
		for(Integer a : arr)
		{
			System.out.println(a);
		}
	}

}
