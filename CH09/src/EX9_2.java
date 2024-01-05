class Person {
	long id; //인스턴스 변수
	
	public boolean equals(Object obj) { //equals()오버라이딩
		if(obj!=null && obj instanceof Person) //우선 타입이 같은지 검사한다.
			return id ==((Person)obj).id; //이후 인스턴스 변수의 값의 일치 여부를 반환한다.
		else {							  // instanceof를 통과했으므로 형변환한다.
			return false;
		}
	}
	
	Person(long id) { //생성자
		this.id = id;
	}
}


public class EX9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(123123123123L); 
		Person p2 = new Person(123123123123L); //다른 객체에 동일한 값 제공
		
		if(p1 == p2) 							//참조변수만 비교했을때는 다름 결과 나옴
			System.out.println("p1과 p2는 같은 사람입니다.");
		else 
			System.out.println("p1과 p2는 다른 사람입니다.");

		if(p1.equals(p2))						//equals()오버라이딩해 인스턴스 비교할때는 같음 결과 나옴.
			System.out.println("p1과 p2는 같은 사람입니다.");
		else 
			System.out.println("p1과 p2는 다른 사람입니다.");
	}

}
