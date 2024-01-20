import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}
class Apple extends Fruit {
	public String toString() { return "Apple";}
}
class Grape extends Fruit {
	public String toString() { return "Grape";}
}
class Toy  {
	public String toString() { return "Toy";}
}
interface Eatable {}


public class EX12_3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit()); //ok
		fruitBox.add(new Apple()); //ok
		fruitBox.add(new Grape()); //ok
		appleBox.add(new Apple()); //ok
//		appleBox.add(new Grape()); //����
//		toyBox.add(new Fruit()); //����
	}

}


class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> { 
	ArrayList<T> list = new ArrayList<T>(); //item ������ list����
	void add(T item) {list.add(item);} //�ڽ��� item �߰�
	T get(int i)     {return list.get(i);} //�ڽ��� item ������
	ArrayList<T> getList() {return list; }
	int size() 		 {return list.size();} //list������ ��ȯ
	public String toStrong() {return list.toString();}
}

