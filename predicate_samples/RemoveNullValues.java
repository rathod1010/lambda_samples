package predicate_samples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullValues {
	
	public static void main(String[] args)
	{
		String[] names = {"Durga","",null,"Ravi","","Shiva",null};
		Predicate<String> p = s->s !=null && s.length()!=0;
		ArrayList<String> l = new ArrayList<>();
		
		for(String s : names)
		{
			if(p.test(s))
			{
				l.add(s);
			}
		}
		
		System.out.println(l);
	}

}
