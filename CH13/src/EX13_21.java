
public class EX13_21 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx21_1 th1 = new ThreadEx21_1();
		ThreadEx21_2 th2 = new ThreadEx21_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {}
		
		System.out.println("소요시간:" + (System.currentTimeMillis() - EX13_21.startTime));
	}

}


class ThreadEx21_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}


class ThreadEx21_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}