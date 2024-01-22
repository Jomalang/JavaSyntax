
class Parent {
	void parentMethod() {}
}

class child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {}
}

interface Testable {
	void test();
//	void check();
	
}

class EX12_7 {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		child c = new child();
		c.parentMethod(); //deprecated »ç¿ë
	}
}
