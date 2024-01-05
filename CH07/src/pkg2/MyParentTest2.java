package pkg2;

import pkg1.Myparent;

class MyChild extends Myparent {
	public void printMembers() {
//		System.out.println(prv); //에러 // private라서
//		System.out.println(dft); //에러// 다른 패키지라서
		System.out.println(prt); //ok //다른패키지여도 원 패키지 소속의 자손이라서
		System.out.println(pub); //ok //원래 제한 없음.
	}
}
public class MyParentTest2 {
	public static void main(String[] args) {
		MyChild p = new MyChild();
//		System.out.println(p.prv); //에러 // private라서
//		System.out.println(p.dft); //에러// 다른 패키지라서
//		System.out.println(p.prt); //에러 // 다른패키지에 해당패키지의 자손도 아니라서
		System.out.println(p.pub); //ok //원래 제한 없음.
	}
}
	
