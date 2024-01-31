import java.util.Comparator;
import java.util.stream.Stream;

public class EX14_5 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 400),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 1, 300),
				new Student("���ڹ�", 3, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 1, 300)
				);
		
		//�⺻ ���� + getBanȰ�� ����
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
		//format�� ����ȭ�� ���, ���� ���ڿ��� �ٲ��ִ� ����ȭ �޼����̴�.
	}
	
	String getName() {return name;}
	int getBan() { return ban;}
	int getTotalScore() {return totalScore;}
	
	//compareTo �������̵�. ���������� ���ı������� ����.
	//���ο� Ŭ������ �⺻���ı����� �������̵� ����� �Ѵ�.
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}
