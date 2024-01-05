
public class Ex7_10 {
	public static void  main(String[] args) {
		
		Unit[] group = { new Marine(), new Tank(), new Dropship()};
		
		for(int i = 0; i <group.length; i++)
		{
			group[i].move(100, 200);
		}
		
	}

}
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit {
	void move (int x, int y) {
		System.out.println("마린이 움직입니다."+x+","+y);
	}
	void stimPack() {}
}

class Tank extends Unit {
	void move (int x, int y) {
		System.out.println("탱크가 움직입니다."+x+","+y);
	}
}

class Dropship extends Unit {
	void move (int x, int y) {
		System.out.println("드랍쉽이 움직입니다."+x+","+(y+100));
	}
}
