package pkg1;

public class Myparent { //접근제어자가 디폴트라서
	private 	int prv; //같은 클래스 내에서만 사용가능
				int dft; //같은 패키지에서만 사용가능
	protected 	int prt; // 같은 패키지 + 자손 사용가능(다른패키지의)
	public 		int pub; // 접근 제한 없음.

	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub); //같은 클래스라서 모두 접근 제한 없음
	}
}

class MyparentTest {

	public static void main(String[] args) {
		Myparent p = new Myparent();
//		System.out.println(p.prv); // 에러, 접근 범위가 안맞음.
		System.out.println(p.dft); //ok
		System.out.println(p.prt); //ok
		System.out.println(p.pub); //ok
	}

}
