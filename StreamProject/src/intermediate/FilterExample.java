package intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> employees = Employee.persons();

		// 람다 표현식
		employees.stream().filter((t) -> t.getIncome() > 10000.00).filter((t) -> t.isMale())
//							.forEach(s -> System.out.println(s.toString()));
							.peek(System.out::println)
							.forEach((Employee s) -> s.setIncome(s.getIncome() * 1.1));
		
		System.out.println("-----------성과급 지급 후------------");
		employees.stream().forEach(System.out::println);
	}
}
