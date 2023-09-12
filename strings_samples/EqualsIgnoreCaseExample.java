package strings_samples;

public class EqualsIgnoreCaseExample {
	
	public static void main(String[] args)
	{
	
		String s1 = "rajkumar";
		String s2 = "rajkumar";
		String s3 = "RAJKUMAR";
		String s4 = "rathod";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		
	}

}
