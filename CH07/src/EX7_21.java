class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

	
	
class Tv2 extends Product {
	Tv2() {super(100);} 
		public String toString() {return "TV";}
	}
	
class Computer extends Product {
	Computer() {super(200); }
	public String toString() { return "Computer";}
}


class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price)
		{
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "��(��)�����߽��ϴ�.");
	}

	void summary() {
		int sum = 0;
		String itemList ="";
	
		for(int i = 0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum +"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��"+ itemList + "�Դϴ�.");
	}

}


public class EX7_21 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		
		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ϸ�����" + b.bonusPoint +"���Դϴ�.");
		b.summary();
	}

}
