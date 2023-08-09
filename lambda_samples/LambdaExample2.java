package lambda_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample2 {
	
	public static List<Integer> filterNumbers(List<Integer> numbers , Predicate<Integer> predicate)
	{
		List<Integer> result = new ArrayList<>();
		for(Integer number : numbers)
		{
			if(predicate.test(number))
			{
				result.add(number);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		{
			numbers.add(i);
		}
		
		//using lambda expression to filter even numbers 
		
		Predicate<Integer> isEven = number->number%2==0;
		List<Integer> evenNumbers = filterNumbers(numbers, isEven);
		
		System.out.println("Even numbers : "+evenNumbers);
	}
	
	

}
