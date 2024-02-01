import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class EX14_11 {

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
		
		System.out.println("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)\n");
		
		Map<Integer, List<Student2>> stuByBan = Stream.of(strArr)
				.collect(groupingBy(Student2::getBan));
		
		for(List<Student2> ban : stuByBan.values()) {
			for(Student2 s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println("\n2. �ܼ��׷�ȭ(������ �׷�ȭ\n");
		Map<Student2, List<Student2>> stuByLevel = Stream.of(strArr)
				.collect(groupingBy(s-> {
					if(s.getScore() >= 200) return Student2.Level.HIGH;
					else if (s.getScore() >= 100) return Student2.Level.MID;
					else						  return Student2.Level.LOW;}
				));
	}

}
