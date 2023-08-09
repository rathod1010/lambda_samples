package lambda_samples;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		list.add("raj");
		list.add("kumar");
		list.add("rajkumar");
		list.add("rathod");
		
		list.forEach((n)->System.out.println(n));
		
	}

}
