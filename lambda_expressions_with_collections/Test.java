package lambda_expressions_with_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(15);
		System.out.println("Before sorting : "+list);
		
		Collections.sort(list);
		
		System.out.println("After sorting : "+list);
		
		Collections.sort(list,new MyComparator());
		
		System.out.println("Descending order : "+list);
		
	}

}
