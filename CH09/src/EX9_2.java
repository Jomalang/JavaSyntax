class Person {
	long id; //�ν��Ͻ� ����
	
	public boolean equals(Object obj) { //equals()�������̵�
		if(obj!=null && obj instanceof Person) //�켱 Ÿ���� ������ �˻��Ѵ�.
			return id ==((Person)obj).id; //���� �ν��Ͻ� ������ ���� ��ġ ���θ� ��ȯ�Ѵ�.
		else {							  // instanceof�� ��������Ƿ� ����ȯ�Ѵ�.
			return false;
		}
	}
	
	Person(long id) { //������
		this.id = id;
	}
}


public class EX9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(123123123123L); 
		Person p2 = new Person(123123123123L); //�ٸ� ��ü�� ������ �� ����
		
		if(p1 == p2) 							//���������� ���������� �ٸ� ��� ����
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else 
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");

		if(p1.equals(p2))						//equals()�������̵��� �ν��Ͻ� ���Ҷ��� ���� ��� ����.
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else 
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
	}

}
