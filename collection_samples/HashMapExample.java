package collection_samples;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] arhs)
	{
		HashMap<String,Integer> languages = new HashMap<>();
		
		languages.put("java", 8);
		languages.put("python", 3);
		languages.put("c++", 5);
		languages.put("c", 11);
		
		System.out.println("Hashmap elements : "+languages);
	}

}
