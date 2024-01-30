import java.util.function.Predicate;

@FunctionalInterface
interface MyFunction1 {
	void run(); // public abstract void run();
}

public class EX14_1 {
	
	static void execute(MyFunction1 f) { // �Ű����� Ÿ���� FI�� �޼���
		f.run();
	}
	
	static MyFunction1 getMyFunction() { //��ȯ Ÿ���� FI�� �޼���
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		MyFunction1 f = () -> System.out.println("f1.run()");
		
		execute(f); //�Ű������� ���ٽ� �ְ� ����
		
		MyFunction1 f2 = new MyFunction1() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		f2.run(); //�Լ��� �������̽� main�ȿ��� ���� �� ���ٽ� ����
		
		getMyFunction().run(); //��ȯŸ�� ���ٽ����� �޾Ƽ� ����
		
		Predicate<String> isEmptyStr = s -> s.length()==0;
		String s = "";
		
		if(isEmptyStr.test(s))
			System.out.println("This is an empty String.");
		else {
			System.out.println(s);
		}
	}

}
