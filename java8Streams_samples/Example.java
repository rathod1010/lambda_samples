package java8Streams_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Rajkumar");
		list.add("rathod");
		list.add("raj");
		list.add("kumar");
		list.add("man");
		
		System.out.println(list);
		
		System.out.println("=================");
		
		List<String> namesList = list.stream().filter(s->s.length()>=5).collect(Collectors.toList());
		
		System.out.println(namesList);
		
		System.out.println("==================");
		
		List<String> uppercaseList = list.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercaseList);
	}

}
