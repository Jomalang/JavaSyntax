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
		return String.format("[%s, %s, %d학년 %d반, %d점]", name, isMale ? "남":"여", hak, ban, score);
	}
	
	//groupoingBy에서 사용
	enum Level {HIGH, MID, LOW}
}

public class EX14_10 {

	public static void main(String[] args) {
		Student2[] strArr = {
				new Student2("조조조", true,  1, 1, 300),
				new Student2("조조김", false, 1, 1, 250),
				new Student2("조김조", true,  1, 1, 100),
				new Student2("김조조", false, 1, 2, 150),
				new Student2("조김김", true,  1, 2, 50),
				new Student2("김김조", false, 1, 2, 300),
				new Student2("김조김", true,  1, 3, 250),
				new Student2("김김김", false, 1, 3, 100),
				new Student2("이김김", true,  1, 3, 150),
				new Student2("김이김", false, 2, 1, 50),
				new Student2("김김이", true,  2, 1, 300),
				new Student2("이이김", false, 2, 1, 350),
				new Student2("김이이", true,  2, 2, 100),
				new Student2("이김이", false, 2, 2, 200),
				new Student2("이이이", true,  2, 2, 50),
				new Student2("박이이", false, 2, 3, 200),
				new Student2("이박이", true,  2, 3, 250),
				new Student2("이이박", false, 2, 3, 100),
				
		};
		
		//성별로 분할
		System.out.println("1. 성별로 분할(단순분할)\n");
		
		Map<Boolean, List<Student2>> stuBySex = Stream.of(strArr)
				.collect(partitioningBy(Student2::isMale));
		
		List<Student2> maleStudent = stuBySex.get(true); // get의 인자로 map의 키를 이용할 수 있다.
		List<Student2> femaleStudent = stuBySex.get(false);
		
		for(Student2 s : maleStudent) System.out.println(s); //향상된 for문
		for(Student2 s : femaleStudent) System.out.println(s);
		
		System.out.println();
		
		//성별 학생수로 분할
		System.out.println("2. 성별+학생수로 분할(단순분할+통계)\n");
		Map<Boolean, Long> stuNumBySex = Stream.of(strArr) //Boolean과 Long타입으로 저장
				.collect(partitioningBy(Student2::isMale, counting()));
		
		System.out.println("남학생 수:"+stuNumBySex.get(true));
		System.out.println("여학생 수:"+stuNumBySex.get(false));
		
		System.out.println();
		
		//성별별 1등
		System.out.println(" 성별1등 (단순분할+통계)\n");
		Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(strArr) //Boolean과 Optional<T>로 저장
				.collect(partitioningBy(Student2::isMale,
						maxBy(comparingInt(Student2::getScore))
						));
		System.out.println("남학생 1등:"+topScoreBySex.get(true));
		System.out.println("여학생 1등:"+topScoreBySex.get(false));
		
		//Optional::get을 이용한 성별별 1등
		Map<Boolean, Student2> topScoreBySex2 = Stream.of(strArr) //Boolean과 Student2타입으로 저장
				.collect(partitioningBy(Student2::isMale, 
						collectingAndThen(maxBy(comparingInt(Student2::getScore)), Optional::get) 
						//Optional은 collectingAndThen의 두번째 인자
						//collectingAndThen은 collect의 두번째 인자
						));
		System.out.println("남학생 1등 : "+ topScoreBySex2.get(true));
		System.out.println("여학생 1등 : "+ topScoreBySex2.get(false));
		
		//다중분할
		System.out.println();
		System.out.println(" 다중 분할(성별 불합격자, 100점 이하\n");
		Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = Stream.of(strArr) //Boolean과 Optional<T>로 저장
				.collect(partitioningBy(Student2::isMale,
						partitioningBy(s->s.getScore() <= 100)
						));
		
		List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		for(Student2 s : failedMaleStu) System.out.println(s);
		for(Student2 s : failedFemaleStu) System.out.println(s);
		
		
		
	}

}
