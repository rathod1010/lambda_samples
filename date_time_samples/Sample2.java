package date_time_samples;

import java.time.LocalDate;

public class Sample2 {
	
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		
		int mm = date.getMonthValue();
		
		int yyyy = date.getYear();
		
		System.out.println(dd+"-"+mm+"-"+yyyy);
		
		
	}

}
