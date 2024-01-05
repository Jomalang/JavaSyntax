class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; //인스턴스 변수에 클래스 변수 값 할당 가능
	//static int cv2 = iv; // 클래스 변수에 인스턴스 변수 값 할당하도록 사용 불가
	static int cv2 = new MemberCall().iv; //객체 생성 후 사용 가능

	static void staticMethod() {
		System.out.println(cv);
		//System.out.println(iv); //클래스 메서드에서 인스턴스 변수 사용불가
		MemberCall C = new MemberCall(); //객체 생성
		System.out.println(C.iv); //객체 생성 이후엔 사용가능
		}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //같은 클래스 안의 인스턴스 변수 사용가능
	}
	
	static void staticMethod1() {
		staticMethod1();
		//instanceMethod1(); // 클래스 메서드에서 인스턴스 메서드 호출 불가
		MemberCall C = new MemberCall(); //객체 생성
		C.instanceMethod1(); // //객체 생성 후에는 사용 가능
	}
	
	//int result = new MemberCall().instanceMethod1();
}
