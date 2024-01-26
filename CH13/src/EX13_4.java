import javax.swing.JOptionPane;

public class EX13_4 {

	public static void main(String[] args) throws Exception {
		
		ThreadEx5_1 t1 = new ThreadEx5_1();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은" + input+"입니다.");
		}
	}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초간 시간 지연함
			} catch (Exception e) {}
		}
	}
}
