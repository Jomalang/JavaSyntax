abstract class Player { //�߻� Ŭ����
	abstract void play(int pos); //�߻� �޼���
	abstract void stop(); //�߻� �޼���
}

// �߻� Ŭ������ ��� ���� �ϼ��ؾ� ��ü ���� ����
class AudioPlayer extends Player {
	void play(int pos) {}
	void stop() {}
}

public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player(); //�߻� Ŭ���� ��ü ���� �Ұ�
		Player ap = new AudioPlayer(); //������
		ap.play(100);
		ap.stop();
		}

}
