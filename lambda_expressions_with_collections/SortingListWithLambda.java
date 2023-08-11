package lambda_expressions_with_collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingListWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(15);
		System.out.println("Before sorting : " + list);
		
		Collections.sort(list, (i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		
		System.out.println("After sorting with lambda functions in descending order :"+list);
	}
}
