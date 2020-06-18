package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DistinctExample {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 2, 3, 3, 5, 6, 5);
		int sum = 0;
//		sum = is.distinct().peek(System.out::println).sum();
//		System.out.println("sum = " + sum);
		
		
		List<Student> list = Arrays.asList(new Student("H", 33), new Student("H", 33),
											new Student("G", 44), new Student("G", 88), 
											new Student("K", 55));
		list.stream().distinct().forEach(s -> System.out.println(s));
	}
}
