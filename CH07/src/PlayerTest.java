abstract class Player { //추상 클래스
	abstract void play(int pos); //추상 메서드
	abstract void stop(); //추상 메서드
}

// 추상 클래스는 상속 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
	void play(int pos) {}
	void stop() {}
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); //추상 클래스 객체 생성 불가
		Player ap = new AudioPlayer(); //다형성
		ap.play(100);
		ap.stop();
		}

}
