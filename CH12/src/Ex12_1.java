import java.util.*;

class Product{}
class Tv2 extends Product{}
class Audio2 extends Product{}

public class Ex12_1 {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product());
		list.add(new Tv2());
		list.add(new Audio2());
		
		System.out.println(list);
	}

}
