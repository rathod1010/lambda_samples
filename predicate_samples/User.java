package predicate_samples;

import java.util.Scanner;
import java.util.function.Predicate;

public class User {

	String username;
	String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public static void main(String[] args)
	{
		Predicate<User> p = user->user.username.equals("rajkumar") && user.password.equals("javaa");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username =sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		User user = new User(username,password);
		
		if(p.test(user))
		{
			System.out.println("Valid User");
		}
		else
		{
			System.out.println("Invalid User");
		}
	}
	
}


