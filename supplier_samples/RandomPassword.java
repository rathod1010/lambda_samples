package supplier_samples;

import java.util.function.Supplier;

public class RandomPassword {
	
	public static void main(String[] args)
	{
		Supplier<String> s = ()->
		{
			String psd = "";
			Supplier<Integer> d =()->(int)(Math.random()*10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*29));
			for(int i=1;i<=8;i++)
			{
				if(i%2==0)
				{
					psd=psd+d.get();
				}
				else
				{
					psd=psd+c.get();
				}
				
			}
			
			return psd;
		};
		
		System.out.println("Random password is = "+s.get());
	}

}
