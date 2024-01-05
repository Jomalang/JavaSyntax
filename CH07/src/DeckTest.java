public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck(); // �� �ϳ� ����ϱ� ���� ��������
		Card c = d.pick(0); //���� ù��° indexī�� �̾Ƽ� c�� �Ҵ���.
		System.out.println(c); //�������� �״�� �����ؼ� ���.. �̰� ��? �̷��� �ּڰ� �����°� �ƴѰ�? 
		                       //�׷��� å������ �� ������ sy...println(c.toString(n))�� ���ٰ� ��. why?
		d.shuffle();
		c = d.pick(0);
		System.out.println(c); //�ٽ� ���� index�̾Ƽ� �� �������� Ȯ��.
	}
}


class Deck {
	final int CARD_NUM = 52; //ī�� ���� ���
	Card cardArr[] = new Card[CARD_NUM]; //Card��ü �迭 ���� ���Խ�Ŵ. �̷��� �Ǵٴ�.. 
	//������ ������ Card�� �������� �ʾƼ� ���� �迭�ϵ�.
	
	Deck() { //�޼��� ����
		int i = 0; //��������
		
		for(int k = Card.KIND_MAX; k > 0; k--)
			for(int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1); //Card��ü �迭�� Card��ü Card������ �̿��� �ʱ�ȭ����.
		// 4*13�ؼ� ���� ���̿� ���� �Ҵ���...
	}//������ ��. 
	
	Card pick(int index) { //ī�� ��ġ(cardArr[]���� �ش� index�� ī�� ���� ������.��ġ���� ���ű���� ����.
		return cardArr[index];
	}
	
	void shuffle() {
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM); //Math��� Ŭ�������� random�޼��� �̿�.
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}//class Deck ��



class Card {
	static final int KIND_MAX = 4; //ī�� ���� ���
	static final int NUM_MAX = 13; // ���̺� ī�� ���
	//final�� ��� ǥ���ε�
	static final int SPADE = 4; //�����̵� ��� 
	static final int DIAMONDE = 3; // ���̾Ƹ�� ���
	static final int HEART = 2; //��Ʈ ���
	static final int CLOVER = 1; //Ŭ�ι� ���
	//�̻� Ŭ���� ����
	int kind; //�ν��Ͻ� ����
	int number; //�ν��Ͻ� ����
	
	Card() { //�⺻������
	this(SPADE, 1); //�Ű����� ������ �̿��� ������ �����ε�
	}
	
	Card(int kind, int number) { //�Ű������� �ִ� ������
		this.kind = kind; //this. => �ν��Ͻ� ������ ���������� �� �Ҵ����ְ� ����.
		this.number = number;
	}
	
	public String toString() { //public class�� �ƴϴ�.. ���� ���� ����.
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; //���ڿ� �迭 ����
		String numbers = "0123456789XJQK"; //���ڿ� Ÿ�� ����, �̰� �ȴٴ�.. ����
		
		return "kind : " +kinds[this.kind]+", number : " + numbers.charAt(this.number); 
		//kinds[]�迭���� �ε����� ���� �ν��Ͻ� ������ String[] kinds���� ������ ����� ����� ����.
		// toString�� ��� Ŭ������ ������ objectŬ������ ���ǵǾ� �ִٰ� ��.
	}//toString()��
}//class Card ����