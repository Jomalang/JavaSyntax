import java.util.Calendar;

public class EX10_5 {
	public static void main(String[] args) {
		if(args.length != 2)
		{
			System.out.println("Usage : java EX10_5 2024 1");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; //1���� ���� ��������
		int END_DAY = 0; // ������ ���� ��������
		
		Calendar sDAY = Calendar.getInstance(); //������
		Calendar eDAY = Calendar.getInstance(); //�� ��
		
		//���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�.
		sDAY.set(year, month-1, 1); //�Է� ���� 1�� ����
		eDAY.set(year, month, 1); //�Է¿��� ���� ����
		
		// �������� ù������ �Ϸ縦 ���� ������� ������ ���� ���Ѵ�.
		eDAY.add(Calendar.DATE, -1);
		
		//1���� ���� �������� �˾Ƴ���.
		START_DAY_OF_WEEK = sDAY.get(Calendar.DAY_OF_WEEK);
		
		// eDAY�� ������ ��¥�� ���´�.
		END_DAY = eDAY.get(Calendar.DATE);
		
		System.out.println("      " + year + "��" + month + "��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		
		// �ش� ���� 1���� ��� ���������� ���� ���� ���
		for(int i = 1; i < START_DAY_OF_WEEK; i++)
			System.out.print("   ");
		
		// �����Ϻ��� ������ �ϱ��� 1�Ͼ� ������Ű�鼭 ���� ���
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++)
		{
			System.out.print((i < 10) ? "  "+i : " "+i);
			if(n%7 == 0) //1���ϸ��� �ٹٲ�
				System.out.println(); 
		}
		
	}
}