abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y);
	void stop() 
	{ System.out.println("����ϴ�.");}
}
	
interface Fightable{
	void move(int x, int y); // public abstract ����
	void attack(Fightable f); // public abstract ����
}

class Fighter extends Unit1 implements Fightable {
	public void move(int x, int y)
	{
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f)
	{
		System.out.println(f+"�� ����");
	}
	
	Fightable getFightable() { // �ο� �� �ִ� ��� �ҷ��´�.
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
//		u.attack(new Fighter()); //��� �Ұ�.
		u.move(200, 300);
		
		Fighter f2 = new Fighter();
		Fightable f3 = f2.getFightable();
		
	}

}
