import java.util.ArrayList;

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood())
				System.out.println(name+ " ate a "+ food);
			else 
				System.out.println(name+ " falied to eat. :(");
		} //while
	}
	
	boolean eatFood() {return table.remove(food); }
		
	}


class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {this.table = table;}
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try {Thread.sleep(100);} catch(InterruptedException e) {}
		} //while
	}
}


class Table {
	String[] dishNames = {"donut", "donut", "spagetti"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) 
		{
			String name = Thread.currentThread().getName();
			System.out.println(name+" is waiting.");
			
			try {
				wait(); //cook������ ��ٸ��� ��.
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify(); //���� �߰� ���� ��ٸ��� �ִٸ� CUST����.
		System.out.println("Dishes:" + dishes.toString());
	} //add()
	
	public boolean remove(String dishNames) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name+" is waiting.");
				try {
					wait(); //CUST������ ��ٸ�����.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			while(true)
			{
				for(int i = 0; i < dishes.size(); i++)
				{
					if(dishNames.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); //���� ���� ���� ��ٸ��� �ִٸ� COOK�� ����.
						return true;	
					}
				}//for	
				
				try {
					System.out.println(name+ " is waiting.");
					wait(); //���ϴ� ������ ���̺� ���� CUST�����带 ��ٸ��� ��.
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			} //while(true)
		} //synchronized
	}//remove
	public int dishNum() {return dishNames.length;}
}



public class EX13_14 {

	public static void main(String[] args) throws Exception {
		Table table = new Table(); //���� ������ �����ϴ� ��ü
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "spagetti"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}

}
