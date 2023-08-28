package double_colon_samples;

public class Test {
	
	public static void main(String[] args)
	{
		
		 Interf i = ()-> {
			 System.out.println("lambda implementation");
		 };
		 
		 i.m1();
		 
	}

}

interface Interf
{
	public void m1();
	
}