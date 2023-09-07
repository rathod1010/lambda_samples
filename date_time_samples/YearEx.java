package date_time_samples;

import java.time.Year;
import java.util.Scanner;

public class YearEx {

	public static void main(String[] arhs)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year number");
		
		int num = sc.nextInt();
		
		Year y = Year.of(num);
		
		if(y.isLeap())
		{
			System.out.println(num+ " is leap year");
		}
		else
		{
			System.out.println(num+" not leap year");
		}
	}
}
