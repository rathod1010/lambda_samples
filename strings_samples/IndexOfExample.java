package strings_samples;

public class IndexOfExample {
	
	public static void main(String[] args)
	{
		String s = "This is the example of index";
		
		int i1 = s.indexOf("is");
		int i2 = s.indexOf("the");
		
		System.out.println(i1+" "+i2);
		
		int i3 = s.indexOf("is",4);
		System.out.println(i3);
		
		int i4 = s.indexOf('s');
		System.out.println(i4);
	}

}
