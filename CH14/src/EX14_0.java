
public class EX14_0 {

	public static void main(String[] args) {		
//		MyFunction f = new MyFunction() {
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
		
		//람다식을 다루기 위한 참조변수 선언
		MyFunction f = (a, b) -> a > b ? a : b;
				
		int value = f.max(3,5);
		System.out.println("value = "+value);
	}
	
}

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 갖는다.
interface MyFunction {
	public abstract int max(int a, int b);
}
