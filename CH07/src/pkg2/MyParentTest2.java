package pkg2;

import pkg1.Myparent;

class MyChild extends Myparent {
	public void printMembers() {
//		System.out.println(prv); //���� // private��
//		System.out.println(dft); //����// �ٸ� ��Ű����
		System.out.println(prt); //ok //�ٸ���Ű������ �� ��Ű�� �Ҽ��� �ڼ��̶�
		System.out.println(pub); //ok //���� ���� ����.
	}
}
public class MyParentTest2 {
	public static void main(String[] args) {
		MyChild p = new MyChild();
//		System.out.println(p.prv); //���� // private��
//		System.out.println(p.dft); //����// �ٸ� ��Ű����
//		System.out.println(p.prt); //���� // �ٸ���Ű���� �ش���Ű���� �ڼյ� �ƴ϶�
		System.out.println(p.pub); //ok //���� ���� ����.
	}
}
	
