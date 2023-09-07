package date_time_samples;

import java.time.LocalDate;
import java.time.Period;

public class Birthday {
	
	public static void main(String[] args)
	{
		LocalDate birthday = LocalDate.of(1999, 10, 10);
		
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		
		System.out.println("your age is "+p.getYears()+"years");
		System.out.println(p.getMonths()+"months");
		System.out.println(p.getDays()+"days");
		
		LocalDate deathday = LocalDate.of(1999+60, 10, 10);
		Period p1 = Period.between(today, deathday);
		
		System.out.println("You will die in :"+p1.getYears());
	}

}
