package date_time_samples;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
	
	public static void main(String[] args)
	{
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		int dd = dt.getDayOfMonth();
		
		int mm = dt.getMonthValue();
		
		int yyyy = dt.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
		
		int hour = dt.getHour();
		
		int min = dt.getMinute();
		
		int sec = dt.getSecond();
		 
		int nano = dt.getNano();
		
		System.out.println(hour+"-"+min+"-"+sec+"-"+nano);
		
		LocalDateTime dt2 = LocalDateTime.of(1999,10,28,12,45);
		System.out.println(dt2);
		System.out.println("After six months :"+dt2.plusMonths(6));
		System.out.println(dt2.plusMinutes(30));
	}

}
