import java.io.*;

public class EX15_BufferedOutputStream {

	public static void main(String[] args) {
		try {
			
			//���� �ƿ�ǲ��Ʈ�� ����
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			//������Ʈ���� ���� ũ�� 5�� ����
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			//���� 123.txt�� 1���� 9���� ���
			for(int i = '1'; i<= '9'; i++) {
				fos.write(i);
			}
					
			
			fos.close();
		} catch (IOException e) {};
	}

}
