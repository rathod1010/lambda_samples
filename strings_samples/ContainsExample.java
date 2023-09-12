package strings_samples;

public class ContainsExample {
	
	public static void main(String args[]){  
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
		String str = "To learn Java visit Javatpoint.com";
		  
		
	
	  
      if(str.contains("Javatpoint.com")) {  
          System.out.println("This string contains javatpoint.com");  
      }
      
      else  
      {
          System.out.println("Result not found");  
      }

  }  

}

