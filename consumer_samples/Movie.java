package consumer_samples;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {
	
	String name;
	String hero;
	String heroine;
	
	
  
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}



	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<>();
		populate(list);
		
		Consumer<Movie> c = m->
		{
			
			System.out.println("Movie name :"+m.name);
			System.out.println("Movei hero :"+m.name);
			System.out.println("Movie heroine :"+m.heroine);
			System.out.println();
		};
		
		for(Movie m :list)
		{
			c.accept(m);
		}
		
		
	}
	
	public static void populate(ArrayList<Movie> list)
	{
		list.add(new Movie("bahubali", "prabhas", "anushka"));
		list.add(new Movie("panja", "pk", "soundarya"));
		list.add(new Movie("jatiratnalu", "naveen", "kiara"));
	}
}
