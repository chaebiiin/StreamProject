package intermediate;

public class Student implements Comparable<Student>{
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
		
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj; //obj를 Student 타입으로 변환
		boolean stdBool = this.name.equals(std.name);
		boolean scoreBool = this.score == std.score;
		return stdBool && scoreBool;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}

}
