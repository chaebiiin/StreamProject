package intermediate;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class MappingExample3 {
	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3, 4, 5 };
		double[] doubleAry = { 1.1, 2.3, 3.5, 4.2, 5.5 };

		IntStream intStream = Arrays.stream(intAry);
		DoubleStream doubleStream = Arrays.stream(doubleAry);

		doubleStream = intStream.asDoubleStream();
		doubleStream.forEach(s -> System.out.println(s));
	
		System.out.println("___________");
		
		intStream = Arrays.stream(intAry);
		intStream.asLongStream().forEach(s-> System.out.println(s));
	}
}
