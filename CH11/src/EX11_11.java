import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX11_11 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //ť�� �ִ� ���� 5�� ����
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">>");
			try {
				// ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim(); //�޼��� ü�̴�, �޼����� ��ȯ���� ���������϶� ��밡��
				
				if("".equals(input)) continue; //�Է��� ��ĭ�̸� continue����
				
				if(input.equalsIgnoreCase("q")) { //q�Է��ϸ� ����
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("Help")) { //��ҹ��� ���о��� ���ϴ� �޼���
					System.out.println("help - ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println("history - �ֱٿ� �Է��� ��ɾ " 
					+ MAX_SIZE+"�� �����ݴϴ�.");
				}
				else if (input.equalsIgnoreCase("history")) {
					save(input); //�Է¹��� ��ɾ �����ϰ�,
					
					LinkedList list = (LinkedList)q; // ����ȯ
					
					final int SIZE = list.size(); //���� ȣ��Ǵ� ������ ���ȭ
					for(int i = 0; i <SIZE; i++)
						System.out.println((i+1)+"."+list.get(i));
					}
				else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("�Է� �����Դϴ�.");
			}
		} //while(true) end	
	} //main() end
	
	public static void save(String input) {
		// offer
		if(!"".equals(input))
			q.offer(input);
		
		// q�� �ִ�ũ�� ������ ó�� �Էµ� �� poll
		if(q.size() > MAX_SIZE)
			q.remove();
	}

} //class EX11_11 end
