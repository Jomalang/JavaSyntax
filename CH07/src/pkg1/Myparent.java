package pkg1;

public class Myparent { //���������ڰ� ����Ʈ��
	private 	int prv; //���� Ŭ���� �������� ��밡��
				int dft; //���� ��Ű�������� ��밡��
	protected 	int prt; // ���� ��Ű�� + �ڼ� ��밡��(�ٸ���Ű����)
	public 		int pub; // ���� ���� ����.

	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub); //���� Ŭ������ ��� ���� ���� ����
	}
}

class MyparentTest {

	public static void main(String[] args) {
		Myparent p = new Myparent();
//		System.out.println(p.prv); // ����, ���� ������ �ȸ���.
		System.out.println(p.dft); //ok
		System.out.println(p.prt); //ok
		System.out.println(p.pub); //ok
	}

}
