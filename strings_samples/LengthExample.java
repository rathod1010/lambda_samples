package strings_samples;

public class LengthExample {
	
	public static void main(String[] args)
	{
		String s1 = "javatpoint";
		String s2 = "python";
		
		System.out.println("String length is :"+s1.length());
		System.out.println("String length is :"+s2.length());
		
		if(s1.length()>0) {  
            System.out.println("String is not empty and length is: "+s1.length());  
        }  
        s1 = "";  
        if(s1.length()==0) {  
            System.out.println("String is empty now: "+s1.length());  
        }  
	}

}
