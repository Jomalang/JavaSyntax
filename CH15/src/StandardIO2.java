import java.io.*;
public class StandardIO2 {

	public static void main(String[] args) {
		PrintStream ps = null; //���� ��Ʈ��
		FileOutputStream fos = null; //��ݽ�Ʈ��
		
		try {
			fos = new FileOutputStream("output.txt"); //��� �ҽ� ����
			ps = new PrintStream(fos); //��ݽ�Ʈ�� ������ ������Ʈ�� ����
			System.setOut(ps); //��� �ҽ��� �ֿܼ��� ps�� ����
			
		} catch (FileNotFoundException e) {
			System.out.println("file not founded");
		}
		
		System.out.println("Hello by system.out");
		System.err.println("Hello by system.err");
	}

}
