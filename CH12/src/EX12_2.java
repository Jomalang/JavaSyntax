import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EX12_2 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>(); //JDE1.7���� ���� ����
		map.put("������", new Student("������",1,1,100,100,100));
		
		Student s = map.get("������");
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
		return  "�̸� : "+this.name+"\n�� : " + this.ban + 
				"\n��ȣ : "+this.no+"\n�������� : "+this.kor+" �������� : "+this.eng+
				" �������� : "+this.math+"\n";

	}
}