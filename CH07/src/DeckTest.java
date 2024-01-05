public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck(); // 덱 하나 사용하기 위한 참조변수
		Card c = d.pick(0); //덱의 첫번째 index카드 뽑아서 c에 할당함.
		System.out.println(c); //참조변수 그대로 전달해서 출력.. 이게 돼? 이러면 주솟값 나오는거 아닌가? 
		                       //그런데 책에서는 이 문장이 sy...println(c.toString(n))과 같다고 함. why?
		d.shuffle();
		c = d.pick(0);
		System.out.println(c); //다시 동일 index뽑아서 잘 섞였는지 확인.
	}
}


class Deck {
	final int CARD_NUM = 52; //카드 개수 상수
	Card cardArr[] = new Card[CARD_NUM]; //Card객체 배열 만들어서 포함시킴. 이런게 되다니.. 
	//하지만 각각의 Card가 생성되지 않아서 깡통 배열일듯.
	
	Deck() { //메서드 영역
		int i = 0; //지역변수
		
		for(int k = Card.KIND_MAX; k > 0; k--)
			for(int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1); //Card객체 배열의 Card객체 Card생성자 이용해 초기화해줌.
		// 4*13해서 각각 무늬와 숫자 할당함...
	}//생성자 끝. 
	
	Card pick(int index) { //카드 뭉치(cardArr[]에서 해당 index의 카드 한장 꺼내줌.뭉치에서 제거기능은 안함.
		return cardArr[index];
	}
	
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM); //Math라는 클래스에서 random메서드 이용.
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}//class Deck 끝



class Card {
	static final int KIND_MAX = 4; //카드 무늬 상수
	static final int NUM_MAX = 13; // 무늬별 카드 상수
	//final은 상수 표현인듯
	static final int SPADE = 4; //스페이드 상수 
	static final int DIAMONDE = 3; // 다이아몬드 상수
	static final int HEART = 2; //하트 상수
	static final int CLOVER = 1; //클로버 상수
	//이상 클래스 변수
	int kind; //인스턴스 변수
	int number; //인스턴스 변수
	
	Card() { //기본생성자
	this(SPADE, 1); //매개변수 생성자 이용한 생성자 오버로딩
	}
	
	Card(int kind, int number) { //매개변수가 있는 생성자
		this.kind = kind; //this. => 인스턴스 변수에 지역변수의 값 할당해주고 있음.
		this.number = number;
	}
	
	public String toString() { //public class가 아니다.. 오해 하지 말자.
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; //문자열 배열 생성
		String numbers = "0123456789XJQK"; //문자열 타입 생성, 이게 된다니.. 감격
		
		return "kind : " +kinds[this.kind]+", number : " + numbers.charAt(this.number); 
		//kinds[]배열안의 인덱스에 들어가는 인스턴스 변수가 String[] kinds에서 동일한 대상을 집어내고 있음.
		// toString은 모든 클래스의 조상인 object클래스에 정의되어 있다고 함.
	}//toString()끝
}//class Card 종료