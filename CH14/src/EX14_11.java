import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class EX14_11 {

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
		
		System.out.println("1. 단순그룹화(반별로 그룹화)\n");
		
		Map<Integer, List<Student2>> stuByBan = Stream.of(strArr)
				.collect(groupingBy(Student2::getBan));
		
		for(List<Student2> ban : stuByBan.values()) {
			for(Student2 s : ban) {
				System.out.println(s);
			}
		}
		
		System.out.println("\n2. 단순그룹화(성적별 그룹화)\n");
		
		Map<Student2.Level, List<Student2>> stuByLevel = Stream.of(strArr)
				.collect(groupingBy(s->{
					if(s.getScore() >= 200) return Student2.Level.HIGH;
					else if (s.getScore() >= 100) return Student2.Level.MID;
					else				 return Student2.Level.LOW;
				}));
		
		TreeSet<Student2.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Student2.Level key : keySet) {
			System.out.println("["+key+"]");
			
			for(Student2 s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		System.out.println("\n3. 단순그룹화+통계(성적별 학생수)\n");
		Map<Student2.Level, Long> stuCntByLevel = Stream.of(strArr)
				.collect(groupingBy(s-> {
					if(s.getScore() >= 200) return Student2.Level.HIGH;
					else if (s.getScore() >= 100) return Student2.Level.MID;
					else 						  return Student2.Level.LOW;
 				}, counting()));
		
		for(Student2.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명\n", key, stuCntByLevel.get(key));
		System.out.println();
		
		
		System.out.println("\n4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Student2>>> stuByHakAndBan = Stream.of(strArr)
				.collect(groupingBy(Student2::getHak, groupingBy(Student2::getBan)));
		
		for(Map<Integer, List<Student2>> hak : stuByHakAndBan.values()) {
			for(List<Student2> ban : hak.values()) {
				System.out.println();
				for(Student2 s : ban)
					System.out.println(s);
			}
		}
		
		
		System.out.println("\n5. 다중그룹화 + 통계(학년별, 반별 1등)\n");
		Map<Integer, Map<Integer, Student2>> topStuByHakAndBan = Stream.of(strArr)
				.collect(groupingBy(Student2::getHak, 
						groupingBy(Student2::getBan,
						collectingAndThen(maxBy(comparingInt(Student2::getScore)), 
						Optional::get)
					)
				));
		
		for(Map<Integer, Student2> ban : topStuByHakAndBan.values())
			for(Student2 s : ban.values())
				System.out.println(s);
		
		
		System.out.println("\n6. 다중 그룹화 + 통계(학년별, 반별 성적그룹)\n");
		Map<String, Set<Student2.Level>> stuByScoreGroup = Stream.of(strArr)
				.collect(groupingBy(s-> s.getHak() + "-"+ s.getBan(),
						mapping(s->{
							if(s.getScore() >= 200) return Student2.Level.HIGH;
							else if(s.getScore() >= 100) return Student2.Level.MID;
							else 						return Student2.Level.LOW;
						}, toSet()
					) //mapping(Student2.Level->Set)
				) //groupingBy
			); //collect
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println("["+key+"]"+ stuByScoreGroup.get(key));
		}
	}//main
}
