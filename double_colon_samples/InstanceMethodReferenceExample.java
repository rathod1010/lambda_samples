package double_colon_samples;

import java.util.function.Consumer;

public class InstanceMethodReferenceExample {
	
	public static void main(String[] args)
	{
		Consumer<String> ref = System.out::println;
		ref.accept("Hello World!");
	}

}
