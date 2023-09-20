package collection_samples;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
	
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Ford");
		set.add("Tata");
		set.add("mahindra");
	    set.add("suzuki");
	    set.add("Honda");
	    
	    for(String vehicles :set)
	    {
	    	System.out.println(vehicles);
	    }
	}

}
