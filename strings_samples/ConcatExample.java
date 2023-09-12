package strings_samples;

public class ConcatExample {
	
	public static void main(String[] args)
	{
		String s1 = "Rathod";
		
		s1.concat("Rajkumar");
		
		System.out.println(s1);
		
		s1=s1.concat(" Rajkumar");
		
		System.out.println(s1);
		
		String s2 = s1.concat(" java");
		
		String s4 = " example";
		
	    System.out.println(s2);
	    
	    String s3 = s1.concat(s4).concat(s2);
	    
	    System.out.println(s3);
	}

}
