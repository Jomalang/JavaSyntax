import java.util.*;

public class HashMapEX2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("������", new Integer(90));
		map.put("�����", new Integer(100));
		map.put("ȭ����", new Integer(100));
		map.put("�ֿ���", new Integer(80));
		map.put("������", new Integer(90));
		
		Set set = map.entrySet(); //entrySet�� ��ȯ���� SetŸ�� set�� ����
		Iterator it = set.iterator(); //���� iterator�� ���
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey()+", ���� : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : "+set); //Ű���� ��ȯ�Ҷ�
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext())
		{
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}

}
