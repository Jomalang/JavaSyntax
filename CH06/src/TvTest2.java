
class TvTest2 {
	public static void main(String args[]) {
		TV t1 = new TV();
		TV t2 = new TV();
		System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		t2 = t1;
		System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
	}

}
