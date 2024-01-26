
public class EX13_6 {

	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		
		th2.setPriority(10);
		
		System.out.println("Prioirty of th1(1) :"+th1.getPriority());
		System.out.println("Prioirty of th2(0) :"+th2.getPriority());
		
		th1.start();
		th2.start();
	}
}


class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("1");
			for(int x=0; x < 10000000; x++); //시간 지연용
		}	
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("0");
			for(int x=0; x < 10000000; x++); //시간 지연용
		}
	}
}