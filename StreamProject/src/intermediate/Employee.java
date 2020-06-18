package intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static enum Gender {
		MALE, FEMALE;
	}
	
	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfbirth;
	private double income;
	
	public Employee(long id, String name, Gender gender, LocalDate dateOfbirth, double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfbirth = dateOfbirth;
		this.income = income;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == Gender.MALE;
	}
	public boolean isFemale() {
		return this.gender == gender.FEMALE;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s %s %s %.2f", id, name, gender, dateOfbirth, income);
		return str;
	}
	
	//기본 데이터
	public static List<Employee> persons() {
		Employee e1 = new Employee(1, "NNN", Gender.MALE, LocalDate.of(1990, Month.JUNE, 30), 21343.0);
		Employee e2 = new Employee(2, "LEO", Gender.MALE, LocalDate.of(1990, Month.NOVEMBER, 10), 5143.0);
		Employee e3 = new Employee(3, "KEN", Gender.MALE, LocalDate.of(1992, Month.APRIL, 6), 5643.0);
		Employee e4 = new Employee(4, "SIK", Gender.MALE, LocalDate.of(1993, Month.FEBRUARY, 15), 262343.0);
		Employee e5 = new Employee(5, "BIN", Gender.MALE, LocalDate.of(1993, Month.SEPTEMBER, 29), 2143.0);
		Employee e6 = new Employee(6, "HYUK", Gender.MALE, LocalDate.of(1995, Month.JULY, 5), 2843.0);
		Employee e7 = new Employee(7, "SOYEE", Gender.FEMALE, LocalDate.of(1996, Month.NOVEMBER, 21), 1243.0);

		return Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		
	}
	
}
