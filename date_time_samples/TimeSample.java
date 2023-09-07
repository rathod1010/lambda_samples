package date_time_samples;

import java.time.LocalTime;

public class TimeSample {
	
	public static void main(String[] args)
	{
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		int hour = time.getHour();
		
		int min = time.getMinute();
		
		int seconds = time.getSecond();
		
		int nanoseconds = time.getNano();
		
		System.out.println(hour+":"+min+":"+seconds+":"+nanoseconds);
	}

}
