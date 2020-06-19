package intermediate;

import java.util.function.Function;
import java.util.stream.*;

public class FlatMapExample2 {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3);
		stream.flatMap((Integer t) -> Stream.of(t * 2)).filter(t -> t > 3).forEach(s -> System.out.println(s));

		
		stream = Stream.of(1, 2, 3);
		int sum = stream.flatMapToInt(t -> IntStream.of(t*2)).sum();
		System.out.println("sum : " + sum);
		
		
		
//		int sum = stream.flatMapToInt(new Function<Integer, IntStream>() {
//			
//			@Override
//			public IntStream apply(Integer t) {
//				
//				return IntStream.of(t*2);
//			}
//			
//		}).sum();
//		System.out.println("sum : " + sum);
	}

}
