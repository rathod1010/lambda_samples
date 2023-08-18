package function_samples;

import java.util.function.Function;

public class RemoveSpace {
	
	public static void main(String[] args)
	{
		String s1 = "Rathod Solutions Hyderabad";
		Function<String, String>  f = s->s.replaceAll(" ", "");
		System.out.println(f.apply(s1));
		
		Function<String, Integer> f1 = s->s.length()-s.replaceAll(" ","").length();
		System.out.println(f1.apply(s1));
	}

}
