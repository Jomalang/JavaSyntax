import java.io.*;

import java.net.URLDecoder;

public class EX15_FileReader {

	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName); // ����Ʈ������ ��Ʈ��(�Է¼ҽ� fileName)
			FileReader fr = new FileReader(fileName); //���ڵ����� ��Ʈ��(�Է¼ҽ� fileName)
			
			int data = 0;
			
			//FileInputStream�� �̿�
			while((data=fis.read()) != -1)
				System.out.print((char)data);
			System.out.println();
			fis.close(); //FileStream����
			
			String decodeVal = "";
			
			
			//FileReader�̿�
			while((data=fr.read()) != -1)
			{
				decodeVal = URLDecoder.decode(String.valueOf((char)data), "UTF-16");
				System.out.print(decodeVal);
			}
				
			System.out.println();
			fr.close(); //FileReader����
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
