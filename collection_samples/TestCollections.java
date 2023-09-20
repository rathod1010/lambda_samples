package collection_samples;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("rajkumar");
		list.add("raj");
		list.add("kumar");
		list.add("rthod");
		
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			String name = iterator.next();
			System.out.println(name);
		}
	}

}
