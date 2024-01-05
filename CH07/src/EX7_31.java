class EX7_31 {
	class InstanceInner {
		int iv = 100;
//		static int cv = 100; // 에러, static변수 선언 불가
		final static int CONST = 100; // 오직 final static만 선언 가능
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static내부 클래스만 static멤버 선언 가능
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; //에러, static변수 사용 불가.
			final static int CONST = 300; //오직 final static만 선언 가능
		}
		
		int i = LocalInner.CONST; //OK
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); //지역 내부 클래스는 메서드 내에서만..
	}

}
