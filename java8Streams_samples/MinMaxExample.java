package java8Streams_samples;

import java.util.ArrayList;

public class MinMaxExample {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(22);
		list.add(15);
		
		Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value from list is "+min);
		
		Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value is "+max);
	}

}
