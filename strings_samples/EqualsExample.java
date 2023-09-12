package strings_samples;

import java.util.ArrayList;

public class EqualsExample {
	
	public static void main(String[] args)
	{
		String s1 = "rajkumar";
		String s2 = "rajkumar";
		String s3 = "RAJKUMAR";
		String s4 = "rathod";
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
		if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     

		 String str1 = "Ravi";  
	        ArrayList<String> list = new ArrayList<>();  
	        list.add("Ravi");   
	        list.add("Mukesh");  
	        list.add("Ramesh");  
	        list.add("Ajay");  
	        for (String str : list) {  
	            if (str.equals(str1)) {  
	                System.out.println("Ravi is present");  
	            }  
	        } 
		
	}

}
