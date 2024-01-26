
public class EX13_8 {

	public static void main(String[] args) {
		Thread t1 = new ThreadEx8_1();
		Thread t2 = new ThreadEx8_2();
		
		t1.start();
		t2.start();
		
		delay(2*1000);
		
		System.out.print("<main 종료>");
	} //main()
	
	static void delay(long millis) {
		try {
			Thread.sleep(2000); //main쓰레드가 잔다...
		} catch (InterruptedException e) {}		
	}
}


class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("1");
		System.out.print("<th1 종료>");
	} //run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("0");
		System.out.print("<th2 종료>");
	} //run()
}