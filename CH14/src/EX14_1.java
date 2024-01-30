import java.util.function.Predicate;

@FunctionalInterface
interface MyFunction1 {
	void run(); // public abstract void run();
}

public class EX14_1 {
	
	static void execute(MyFunction1 f) { // 매개변수 타입이 FI인 메서드
		f.run();
	}
	
	static MyFunction1 getMyFunction() { //반환 타입이 FI인 메서드
		MyFunction1 f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
		MyFunction1 f = () -> System.out.println("f1.run()");
		
		execute(f); //매개변수로 람다식 주고 실행
		
		MyFunction1 f2 = new MyFunction1() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		f2.run(); //함수형 인터페이스 main안에서 구현 후 람다식 실행
		
		getMyFunction().run(); //반환타입 람다식으로 받아서 실행
		
		Predicate<String> isEmptyStr = s -> s.length()==0;
		String s = "";
		
		if(isEmptyStr.test(s))
			System.out.println("This is an empty String.");
		else {
			System.out.println(s);
		}
	}

}
