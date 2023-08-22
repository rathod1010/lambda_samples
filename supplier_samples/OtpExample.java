package supplier_samples;

import java.util.function.Supplier;

public class OtpExample {
	
	public static void main(String[] args)
	{
		//to generate randomly six digit otp,,
		
		Supplier<String> s = ()->
		{
			String otp = "";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			
			
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
