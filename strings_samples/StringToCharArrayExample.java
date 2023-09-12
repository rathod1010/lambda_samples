package strings_samples;

public class StringToCharArrayExample {
	
	public static void main(String[] args)
	{
		String s = "hello";
		
		char[] ch = s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
