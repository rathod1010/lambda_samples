package predicate_samples;

import java.util.function.Predicate;

public class DisplayName {
	
	public static void main(String[] args)
	{
		String[] names = {"Sunny","Kajal","Mallika","Katrina","Kareena","Sharuk","Raj","Kapil"};
		
		Predicate<String> startsWithK = s-> s.charAt(0)=='K';
		
		System.out.println("the names starts with K are :");
		
		for(String s : names)
		{
			if(startsWithK.test(s))
			{
				System.out.println(s);
			}
		}
	}

}
