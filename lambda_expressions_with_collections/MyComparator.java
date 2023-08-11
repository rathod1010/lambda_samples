package lambda_expressions_with_collections;

import java.util.Comparator;

//without lambda expression

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		
		//using ternary operator
		
		return (i1>i2)?-1:(i1<i2)?+1:0; 
		
		
		//using if else condition

//		if (i1 > i2) {
//			return -1;
//		}
//
//		else if (i1 < i2) {
//			return 1;
//		} else {
//
//			return 0;
//
//		}

	}

}
