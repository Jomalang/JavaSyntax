
public class EX14_0 {

	public static void main(String[] args) {		
//		MyFunction f = new MyFunction() {
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
		
		//���ٽ��� �ٷ�� ���� �������� ����
		MyFunction f = (a, b) -> a > b ? a : b;
				
		int value = f.max(3,5);
		System.out.println("value = "+value);
	}
	
}

@FunctionalInterface //�Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ���´�.
interface MyFunction {
	public abstract int max(int a, int b);
}
