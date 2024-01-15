import java.util.Arrays;
import java.util.Comparator;

public class EX11_19 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //String�� Comparable������ ���� ����
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //��ҹ��� ���� ���ϱ�
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr="+Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2)
	{
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1);
//					c1.compareTo(c2) * -1; //-1�� ���� �⺻ ���Ĺ���� ������ ����
		}
		return -1;
	}
}
