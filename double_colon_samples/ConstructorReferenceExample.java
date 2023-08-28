package double_colon_samples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
	
	public static void main(String[] args)
	{
		Supplier<List<String>> list = ArrayList::new;
		
		List<String> l = list.get();
		l.add("raj");
		l.add("kumar");
		l.add("rah");
//		l.forEach(System.out::printl);
		System.out.println(l);
	}

}
