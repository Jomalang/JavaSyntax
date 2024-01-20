import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EX12_2 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>(); //JDE1.7부터 생략 가능
		map.put("조현진", new Student("조현진",1,1,100,100,100));
		
		Student s = map.get("조현진");
		System.out.println(s);
		
		}		
	}



class Student {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String toString() {
		return  "이름 : "+this.name+"\n반 : " + this.ban + 
				"\n번호 : "+this.no+"\n국어점수 : "+this.kor+" 영어점수 : "+this.eng+
				" 수학점수 : "+this.math+"\n";

	}
}