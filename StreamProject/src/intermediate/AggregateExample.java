package intermediate;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.stream.LongStream;

public class AggregateExample {

	public static void main(String[] args) {
		int[] count = { 1, 2, 3, 4, 5 };
		long cnt = Arrays.stream(count).filter(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value%2==0;
			}
		}).count();
		System.out.println("2의 배수의 개수는 =  " +cnt);
		int[] count1 = {1,2,3,4,5};
		long cnt1 = Arrays.stream(count1).filter(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value%2==0;
			}
		}).sum();
		System.out.println("2의 배수의 합은 =  " +cnt1);
		
	double[] count2 = {1,2,3,4,5};
	double cnt2 = Arrays.stream(count2).filter(new DoublePredicate() {
		
		@Override
		public boolean test(double value) {
			return value%2==0;
		}
	}).average().getAsDouble();
	System.out.println("2의 배수의 평균은 =  " + cnt2);

	}
}
