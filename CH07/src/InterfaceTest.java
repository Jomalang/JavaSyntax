class A {
	public void method (I i) {
		i.method();
	}
}

interface I { //선언과 구현 분리
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B클래스 메서드 실행");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스 메서드 실행");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); //A가 B를 직접 사용(A가 B에 의존)
	}

}
