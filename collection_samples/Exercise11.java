package collection_samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("blue");
		list.add("yellow");
		list.add("black");
		
		System.out.println("List before reversing : "+list);
		
		Collections.reverse(list);
		
		System.out.println("List after reversing : "+list);
	}

}
