package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamExample {
	static int sum = 0;
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum += square;
			}
		}
		System.out.println("결과 = " + sum);
		
		numbers.stream().filter((t) -> t % 2 == 1).map(t -> t*t).forEach(s -> sum+= s);
		System.out.println("결과 = " + sum); //위의 람다 표현식.

//		Predicate<Integer> predicate = (t) -> t % 2 == 1; // 람다 표현식.
//		Function<Integer, Integer> function = new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				return t * t;
//			}
//
//		}; // 맨 마지막 구문을 쓰면 위의 내용을 안 써도 됨

//		Predicate<Integer> predicate = new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				return t % 2 == 1;
//			}
//
//		};

//		numbers.stream().filter((t) ->t % 2 == 1).forEach(s -> System.out.println(s)); //람다   1,3,5 값 출력					
//		numbers.stream().filter(predicate).forEach(s -> System.out.println(s)); // 스트림에 있는 반복 요소들을 출력 해보겠다는 뜻 1,2,3,4,5 츨력됨.
//		numbers.stream().filter((t) -> t % 2 == 1).map(function).forEach(s -> System.out.println(s)); // 위의 출력값의 제곱값이 1,9,25출력

//		numbers.stream().filter((t) -> t % 2 == 1).map(function).forEach(s -> sum += s);
//		System.out.println("결과 : " + sum); 결과 값 70 
	}
}
