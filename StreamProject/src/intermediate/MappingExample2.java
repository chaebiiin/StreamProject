package intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample2 {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();
		employees.stream().map(new Function<Employee, String>() {

			@Override
			public String apply(Employee t) {
				return t.getName();
			}
		}).filter(new Predicate<String> () {

			@Override
			public boolean test(String t) {
				return t.startsWith("Y");
			}
		}).forEach(s -> System.out.println(s));
		
		employees.stream().map(new Function<Employee, String>() {

			@Override
			public String apply(Employee t) {
				return (t.getName() + "\t" + t.getDateOfbirth());
			}
		}).flatMap(new Function<String, Stream<Character>>() {
			@Override
			public Stream<Character> apply(String t) {
				return IntStream.range(0, t.length()).mapToObj(new IntFunction<Character>() {
					@Override
					public Character apply(int value) {
						return t.charAt(value);
					}
				});
			}
		}).forEach(s-> System.out.println(s));
	}
}
