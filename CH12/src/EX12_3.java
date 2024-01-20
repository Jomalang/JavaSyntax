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
//		appleBox.add(new Grape()); //에러
//		toyBox.add(new Fruit()); //에러
	}

}


class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> { 
	ArrayList<T> list = new ArrayList<T>(); //item 저장할 list선언
	void add(T item) {list.add(item);} //박스에 item 추가
	T get(int i)     {return list.get(i);} //박스에 item 꺼내기
	ArrayList<T> getList() {return list; }
	int size() 		 {return list.size();} //list사이즈 반환
	public String toStrong() {return list.toString();}
}

