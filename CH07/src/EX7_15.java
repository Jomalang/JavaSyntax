
public class EX7_15 {
	public static void main(String[] arg) {
		Car car = new Car();
		FireEngine fe = new FireEngine();
		
//		FireEngine fe2 = (FireEngine)car;
		Car car2 = (Car)fe;
		car2.dirve();
	}
}

class Car {
	String color;
	int door;
	
	void Car() {
		this.color = "white";
		this.door = 4;
	}
	
	void dirve() {
		System.out.println("drive~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!");
	}
}
