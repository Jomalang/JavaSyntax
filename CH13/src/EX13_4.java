import javax.swing.JOptionPane;

public class EX13_4 {

	public static void main(String[] args) throws Exception {
		
		ThreadEx5_1 t1 = new ThreadEx5_1();
		t1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ����" + input+"�Դϴ�.");
		}
	}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1�ʰ� �ð� ������
			} catch (Exception e) {}
		}
	}
}
