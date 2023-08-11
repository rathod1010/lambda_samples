package lambda_expressions_with_collections;

import java.util.TreeMap;

//sorting in treemap using lambda expression

public class TreeMapExample {
	
	public static void main(String[] args)
	{
//		TreeMap<Integer,String> map = new TreeMap<>();
		
		TreeMap<Integer,String> map = new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);

		map.put(100, "Durga");
		map.put(102,"Raj");
		map.put(303,"Kumar");
		map.put(400, "Rajkumar");
		map.put(220,"Rathod");
		System.out.println(map);
	}

}
