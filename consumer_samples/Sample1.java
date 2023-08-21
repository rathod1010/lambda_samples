package consumer_samples;

import java.util.function.Consumer;

public class Sample1 {
	
	public static void main(String[] args)
	{
		Consumer<String> c = s->System.out.println(s);
		c.accept("rathod");
		c.accept("rajkumar");
		c.accept("raj");
	}

}
