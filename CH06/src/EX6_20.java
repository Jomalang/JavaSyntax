class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv; //�ν��Ͻ� ������ Ŭ���� ���� �� �Ҵ� ����
	//static int cv2 = iv; // Ŭ���� ������ �ν��Ͻ� ���� �� �Ҵ��ϵ��� ��� �Ұ�
	static int cv2 = new MemberCall().iv; //��ü ���� �� ��� ����

	static void staticMethod() {
		System.out.println(cv);
		//System.out.println(iv); //Ŭ���� �޼��忡�� �ν��Ͻ� ���� ���Ұ�
		MemberCall C = new MemberCall(); //��ü ����
		System.out.println(C.iv); //��ü ���� ���Ŀ� ��밡��
		}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //���� Ŭ���� ���� �ν��Ͻ� ���� ��밡��
	}
	
	static void staticMethod1() {
		staticMethod1();
		//instanceMethod1(); // Ŭ���� �޼��忡�� �ν��Ͻ� �޼��� ȣ�� �Ұ�
		MemberCall C = new MemberCall(); //��ü ����
		C.instanceMethod1(); // //��ü ���� �Ŀ��� ��� ����
	}
	
	//int result = new MemberCall().instanceMethod1();
}
