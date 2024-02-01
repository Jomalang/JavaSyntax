import java.util.*;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


class Student2 {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	
	String getName() {return name;}
	boolean isMale() {return isMale;}
	int getHak() {return hak;}
	int getBan() {return ban;}
	int getScore() {return score;}
	
	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %d��]", name, isMale ? "��":"��", hak, ban, score);
	}
	
	//groupoingBy���� ���
	enum Level {HIGH, MID, LOW}
}

public class EX14_10 {

	public static void main(String[] args) {
		Student2[] strArr = {
				new Student2("������", true,  1, 1, 300),
				new Student2("������", false, 1, 1, 250),
				new Student2("������", true,  1, 1, 100),
				new Student2("������", false, 1, 2, 150),
				new Student2("�����", true,  1, 2, 50),
				new Student2("�����", false, 1, 2, 300),
				new Student2("������", true,  1, 3, 250),
				new Student2("����", false, 1, 3, 100),
				new Student2("�̱��", true,  1, 3, 150),
				new Student2("���̱�", false, 2, 1, 50),
				new Student2("�����", true,  2, 1, 300),
				new Student2("���̱�", false, 2, 1, 350),
				new Student2("������", true,  2, 2, 100),
				new Student2("�̱���", false, 2, 2, 200),
				new Student2("������", true,  2, 2, 50),
				new Student2("������", false, 2, 3, 200),
				new Student2("�̹���", true,  2, 3, 250),
				new Student2("���̹�", false, 2, 3, 100),
				
		};
		
		//������ ����
		System.out.println("1. ������ ����(�ܼ�����)\n");
		
		Map<Boolean, List<Student2>> stuBySex = Stream.of(strArr)
				.collect(partitioningBy(Student2::isMale));
		
		List<Student2> maleStudent = stuBySex.get(true); // get�� ���ڷ� map�� Ű�� �̿��� �� �ִ�.
		List<Student2> femaleStudent = stuBySex.get(false);
		
		for(Student2 s : maleStudent) System.out.println(s); //���� for��
		for(Student2 s : femaleStudent) System.out.println(s);
		
		System.out.println();
		
		//���� �л����� ����
		System.out.println("2. ����+�л����� ����(�ܼ�����+���)\n");
		Map<Boolean, Long> stuNumBySex = Stream.of(strArr) //Boolean�� LongŸ������ ����
				.collect(partitioningBy(Student2::isMale, counting()));
		
		System.out.println("���л� ��:"+stuNumBySex.get(true));
		System.out.println("���л� ��:"+stuNumBySex.get(false));
		
		System.out.println();
		
		//������ 1��
		System.out.println(" ����1�� (�ܼ�����+���)\n");
		Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(strArr) //Boolean�� Optional<T>�� ����
				.collect(partitioningBy(Student2::isMale,
						maxBy(comparingInt(Student2::getScore))
						));
		System.out.println("���л� 1��:"+topScoreBySex.get(true));
		System.out.println("���л� 1��:"+topScoreBySex.get(false));
		
		//Optional::get�� �̿��� ������ 1��
		Map<Boolean, Student2> topScoreBySex2 = Stream.of(strArr) //Boolean�� Student2Ÿ������ ����
				.collect(partitioningBy(Student2::isMale, 
						collectingAndThen(maxBy(comparingInt(Student2::getScore)), Optional::get) 
						//Optional�� collectingAndThen�� �ι�° ����
						//collectingAndThen�� collect�� �ι�° ����
						));
		System.out.println("���л� 1�� : "+ topScoreBySex2.get(true));
		System.out.println("���л� 1�� : "+ topScoreBySex2.get(false));
		
		//���ߺ���
		System.out.println();
		System.out.println(" ���� ����(���� ���հ���, 100�� ����\n");
		Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = Stream.of(strArr) //Boolean�� Optional<T>�� ����
				.collect(partitioningBy(Student2::isMale,
						partitioningBy(s->s.getScore() <= 100)
						));
		
		List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		for(Student2 s : failedMaleStu) System.out.println(s);
		for(Student2 s : failedFemaleStu) System.out.println(s);
		
		
		
	}

}
