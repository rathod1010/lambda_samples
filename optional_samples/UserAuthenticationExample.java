package optional_samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserAuthenticationExample {

	public static void main(String[] args)
	{
		Map<String, String> user = new HashMap<>();
		user.put("raj", "raj1010");
		
		String usernameToAuthenticate = "raj";
		String enteredPassword="raj1010";
		
		Optional<String> storedPasswordOptional = Optional.ofNullable(user.get(usernameToAuthenticate));
		
		boolean isAuthenticated = storedPasswordOptional.filter(psd->psd.equals(enteredPassword)).isPresent();
		
		if(isAuthenticated)
		{
			System.out.println("Authentication Successful...!!");
		}
		else
		{
			System.out.println("Authentication Failed....!!");
		}
	}
}
