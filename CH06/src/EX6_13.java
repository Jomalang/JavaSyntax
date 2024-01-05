class EX6_13 {
	public static void main(String[] args) {
		EX6_13 r = new EX6_13();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0}; //배열 생성 후 result2[0]의 값 0으로 초기화
		r.add(3,5, result2);
		System.out.println(result2[0]);
		
	}
	int add(int a, int b) {
		return a + b;
	}
	
	void add(int i, int j, int[] result) {
		result[0] = i+j;
	}
}
