package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lamda", "stream mapping");
		Stream<String> stream = inputList1.stream();
		stream.flatMap(new Function<String, Stream<String>>() {

			@Override
			public Stream<String> apply(String t) {
				String[] strAry = t.split(" ");
				return Arrays.stream(strAry);
			}

		}).forEach(System.out::println);

		List<String> inputList2 = Arrays.asList("10,20,30", "40,50,60");
		inputList2.stream().flatMapToInt(new Function<String, IntStream>(){

			@Override
			public IntStream apply(String t) {
				String[] strAry = t.split(",");
				int [] intAry = new int[strAry.length];
				for(int i=0; i<strAry.length;i++) {
					intAry[i] = Integer.parseInt(strAry[i]);
				}
				return Arrays.stream(intAry);
			}
			
		}).forEach(System.out::println);
	
		
	}

}
