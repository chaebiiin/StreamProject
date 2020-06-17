package basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {
	private String name;
	private int score;

	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return this.name; }
	public int getScore() { return this.score; }
	
}	

	public class FromCollectionExample {
		public static void main(String[] args) {
			List<Student> fromCollectionExamples = Arrays.asList(new Student("H", 35),new Student("S", 75),
					new Student("P", 95),new Student("G", 88));
			
//			Predicate<FromCollectionExample> predicate = new Predicate<FromCollectionExample>() {
//
//				@Override
//				public boolean test(FromCollectionExample t) {
//					return t.getScore() > 70;
//				}
//			};
			
			fromCollectionExamples.stream().filter(t-> t.getScore() > 70).forEach((t)-> System.out.println(t.getName() +"," + t.getScore()));
//			students.stream().forEach((t)-> System.out.println(t.getName() +"," + t.getScore())); // 람다
			
			
//			Stream<FromCollectionExample> stream = students.stream();
//			stream.forEach(new Consumer<FromCollectionExample>() {
//
//				@Override
//				public void accept(FromCollectionExample t) {
//					System.out.println(t.getName() +"," + t.getScore());
//				}
//				
//			});
	}	
}
	
