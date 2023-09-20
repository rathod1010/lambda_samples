package collection_samples;

import java.util.ArrayList;

public class ArrayListContainsExample {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(3);
		al.add(5);
		al.add(13);
		al.add(23);
		al.add(7);
		
		if(al.contains(7))
		{
			System.out.println("7 was found in the list");
		}
		else
		{
			System.out.println("7 was not found in the list");
		}
	}

}
