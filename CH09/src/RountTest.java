import java.util.ArrayList;

public class RountTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // JDK1.5�������� ����
		list.add(new Integer(100)); // ArrayListŸ���� ��ü�� ���尡������
		
		int i = list.get(0);
	
	}

}
