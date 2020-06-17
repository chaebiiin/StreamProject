package basic;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromIntRangeExample {

	public static void main(String[] args) {
//		IntStream stream = IntStream.range(11, 20);//11,12,13,14,15,16,17,18,19가 출력됨 20은 미 포함.
		IntStream stream = IntStream.rangeClosed(11, 20);
//		IntPredicate predicate = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				return value % 2 == 1;
//			}
//		};

//		IntPredicate predicate = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				return value > 50;
//			}
//		};
//		IntPredicate predicate1 = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				return value < 60;
//			}
//		};

//		stream.forEach(s -> System.out.println(s)); //20도 포함.
//		stream.filter(predicate).forEach(s -> System.out.println(s)); // 홀수만 출력되게

		Random random = new Random();
		IntStream intStream = random.ints(30, 1, 100); // 11~100까지의 숫자중 랜덤 수 10개 추출
//		intStream.forEach(s -> System.out.println(s));
//		intStream.filter(predicate).filter(predicate1).forEach(s -> System.out.println(s));
		intStream.filter((value)-> value > 50 && value <60).forEach(s-> System.out.println(s));
	}
}
