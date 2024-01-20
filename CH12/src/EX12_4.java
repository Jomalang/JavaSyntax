

class Juice {
	String name;
	
	Juice(String name) {this.name = name+"Juice";}
	public String toString() { return name;}
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { //���ϵ� ī��
		String tmp ="";
		
		//���� for��, box.getList()���� ��ȯ�ϴ� ���� �ϳ��� Fruit f�� ����
		for(Fruit f : box.getList()) //getList�� ArrayList<T>�� ��ȯ�� ����
			tmp += f+" "; //f�� ���ڿ��� ����.. tmp�� �����Ŵ
		return new Juice(tmp);
	}
}

public class EX12_4 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox)); //���ϵ� ī�� ���п� ����
		
	}

}


