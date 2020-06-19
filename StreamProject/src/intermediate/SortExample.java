package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("A", 30), new Student("B", 25), new Student("C", 55));
		students.stream().sorted().forEach(s -> System.out.println(s));

		List<Person> persons = Arrays.asList(new Person("E", 10), new Person("D", 15), new Person("F", 15));

		persons.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}

		}).forEach(System.out::println);
	}
}
