package double_colon_samples;

public class Sample {
	
	public static void m2()
	{
		System.out.println("Implementation by Method Reference");
	}
	
	public static void main(String[] args)
	{
		Hello i = Sample :: m2;
		i.m1();
		
	}

}

interface Hello
{
	public void m1();
}