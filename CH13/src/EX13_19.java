
public class EX13_19 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(3000);
			th3.stop();
		} catch(InterruptedException e) {}
	}
}

class MyThread implements Runnable {
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	public MyThread(String name) {
		th = new Thread(this, name); // Thread(Runnable r, String name)
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended)
			{
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
		System.out.println(Thread.currentThread().getName()+"- stopped");
	}
	void start() {
		th.start();
	}
	
	public void suspend() {
		suspended = true;
	}
	public void resume() {
		suspended = false;
	}
	public void stop() {
		stopped = true;
	}
}
