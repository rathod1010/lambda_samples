package lambda_expressions_with_collections;

import java.util.TreeSet;

//sorting elements of treeset in descending order using lambda expression

public class TreeSetExample {
	
	public static void main(String[] args)
	{
//		TreeSet<Integer> t = new TreeSet<>();
		TreeSet<Integer> t = new TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(33);
		t.add(88);
		System.out.println(t);
		
		
	}

}
