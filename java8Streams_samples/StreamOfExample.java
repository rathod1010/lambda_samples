package java8Streams_samples;

import java.util.stream.Stream;

public class StreamOfExample {
	
	public static void main(String[] args)
	{
		Stream<Integer> s = Stream.of(1,11,111,1111,11111);
		s.forEach(System.out::println);
	}

}
