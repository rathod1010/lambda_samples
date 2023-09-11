package optional_samples;

import java.util.Optional;

public class OptinalSample {
	
	public static void main(String[] args)
	{
		String[] str = new String[10];
		//if value is not present
		
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent())
		{
			String lower = str[5].toLowerCase();
			System.out.println(lower);
		}
		
		else
		{
			System.out.println("String value is not present");
			
		}
		
		str[4]="OPTIONAL";
		Optional<String> nullCheck = Optional.ofNullable(str[4]);
		if(nullCheck.isPresent())
		{
			String lowercase = str[4].toLowerCase();
			System.out.println(lowercase);
		}
		else
		{
			System.out.println("String value is not present here");
		}
	}
	
	

}
