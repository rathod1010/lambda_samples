package strings_samples;

public class ReplaceExample1 {
	
	public static void main(String[] args)
	{
		String s1 = "How are you doing ?";
		
		String replaceString = s1.replace('a', 'e');
		System.out.println(replaceString);
		
		String repString = s1.replace("How","What");
		System.out.println(repString);
	}

}
