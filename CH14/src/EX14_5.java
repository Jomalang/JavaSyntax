import java.util.Comparator;
import java.util.stream.Stream;

public class EX14_5 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("조자바", 3, 400),
				new Student("김자바", 1, 200),
				new Student("이자바", 2, 100),
				new Student("박자바", 1, 300),
				new Student("최자바", 3, 200),
				new Student("나자바", 2, 100),
				new Student("문자바", 1, 300)
				);
		
		//기본 정렬 + getBan활용 정렬
		studentStream.sorted(Comparator.comparing(Student::getBan).reversed()
		.thenComparing(Comparator.naturalOrder()).reversed()).forEach(System.out::println);; 

	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
		//format은 형식화때 배운, 수를 문자열로 바꿔주는 형식화 메서드이다.
	}
	
	String getName() {return name;}
	int getBan() { return ban;}
	int getTotalScore() {return totalScore;}
	
	//compareTo 오버라이딩. 내림차순을 정렬기준으로 삼음.
	//새로운 클래스라서 기본정렬기준을 오버라이딩 해줘야 한다.
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}
