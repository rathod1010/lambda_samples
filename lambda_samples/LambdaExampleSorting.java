package lambda_samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExampleSorting {
	
	public static void main(String[] args)
	{
		List<String> words = new ArrayList<>();
		words.add("apple");
		words.add("banana");
		words.add("cherry");
		words.add("date");
		
		Collections.sort(words,(str1,str2)->str1.length()-str2.length());
		System.out.println("Sorted words by length : "+words);
	}

}
