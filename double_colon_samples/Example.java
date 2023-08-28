package double_colon_samples;

public class Example {
	
	public Example()
	{
		System.out.println("Constructor Reference");
	}
	
	public static void main(String[] args)
	{
		
		Inter i = Example::new;
		i.get();
		
	}

}

interface Inter
{
	public Example get();
}
