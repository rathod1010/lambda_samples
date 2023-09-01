package java8Streams_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfElements {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Rajkumar");
		list.add("rathod");
		list.add("raj");
		list.add("kumar");
		list.add("man");
		list.add("hero");
		
		System.out.println(list);
		System.out.println("====================================");
		
		long count = list.stream().filter(i->i.length()>=5).count();
		List<String> l = list.stream().filter(i->i.length()>=5).collect(Collectors.toList());
		System.out.println(l);
		System.out.println("Count is "+count);
		
		
	}

}
