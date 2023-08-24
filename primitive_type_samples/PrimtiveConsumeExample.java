package primitive_type_samples;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimtiveConsumeExample {
	
	public static void main(String[] args)
	{
		Consumer<Integer> c = i->System.out.println(i*i);
		c.accept(10);
		
		IntConsumer cd = i->System.out.println(i+10);
		cd.accept(20);
		
		LongConsumer ld = i->System.out.println(i*10);
		ld.accept(10);
		
		
	}

}
