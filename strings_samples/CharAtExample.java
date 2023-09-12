package strings_samples;

public class CharAtExample {
	
	public static void main(String[] args)
	{
		String name = "Rathod Rajkumar";
		
		char ch = name.charAt(5);
		
		char ch2 = name.charAt(8);
		
		System.out.println(ch);
		
		System.out.println(ch2);
		
		//accessing first and last index of a string
		
		System.out.println("character at 0th index : "+name.charAt(0));
		int strLength = name.length();
		System.out.println("character at last index : "+name.charAt(strLength-1));
		
		//printing character present at odd positions
		
			for(int i=0;i<=name.length()-1;i++)
			{
				if(i%2!=0)
				{
					System.out.println("Character at "+i+" place "+name.charAt(i));
				}
			}
			
			//Counting Frequency of a character in a String by Using the charAt() Method
			
			int count =0 ;
			
			for(int i=0;i<=name.length()-1;i++)
			{
				if(name.charAt(i)=='a')
				{
					count++;
				}
			}
			
			System.out.println("Frequency of a is :"+count);
	}

}
