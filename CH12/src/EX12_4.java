

class Juice {
	String name;
	
	Juice(String name) {this.name = name+"Juice";}
	public String toString() { return name;}
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { //와일드 카드
		String tmp ="";
		
		//향상된 for문, box.getList()에서 반환하는 값을 하나씩 Fruit f에 담음
		for(Fruit f : box.getList()) //getList는 ArrayList<T>의 반환값 가짐
			tmp += f+" "; //f를 문자열로 만들어서.. tmp에 연결시킴
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
		System.out.println(Juicer.makeJuice(appleBox)); //와일드 카드 덕분에 성립
		
	}

}


