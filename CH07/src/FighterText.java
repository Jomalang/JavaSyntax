abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y);
	void stop() 
	{ System.out.println("멈춥니다.");}
}
	
interface Fightable{
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit1 implements Fightable {
	public void move(int x, int y)
	{
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f)
	{
		System.out.println(f+"를 공격");
	}
	
	Fightable getFightable() { // 싸울 수 있는 상대 불러온다.
		Fighter f = new Fighter();
		return f;
	}
}


public class FighterText {

	public static void main(String[] args) {
//		Fighter f = new Fighter();
		Fightable f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		
		Unit1 u = new Fighter();
		u.stop();
//		u.attack(new Fighter()); //사용 불가.
		u.move(200, 300);
		
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightable();
		
	}

}
