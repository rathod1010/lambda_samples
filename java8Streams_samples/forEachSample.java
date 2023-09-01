package java8Streams_samples;

import java.util.ArrayList;

public class forEachSample {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(22);
		list.add(15);
		
		list.stream().forEach(s->System.out.println(s));
		
		System.out.println("=================");
		
		list.stream().forEach(System.out::println);
	}

}
