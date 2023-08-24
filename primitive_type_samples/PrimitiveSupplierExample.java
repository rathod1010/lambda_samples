package primitive_type_samples;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class PrimitiveSupplierExample {
	
	public static void main(String[] args)
	{
		Supplier<Integer> s =()->(int)(Math.random()*10);
		String otp ="";
		for(int i=0;i<6;i++)
		{
			otp=otp+s.get();
		}
		
		System.out.println("OTP :"+otp);
		
		IntSupplier d = ()->(int)(Math.random()*10);
		String otps="";
		for(int i=0;i<6;i++)
		{
			otps=otps+d.getAsInt();
		}
		
		System.out.println("OTP :"+otps);
		System.out.println("OTP :"+otps);
		
		System.out.println("OTP :"+otps);
		
		
		
	}

}
