package collection_samples;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String args[])
	{
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("Orange");
		fruits.add("pomogrante");
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
	}

}
