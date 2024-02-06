import java.io.*;

import java.net.URLDecoder;

public class EX15_FileReader {

	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName); // 바이트데이터 스트림(입력소스 fileName)
			FileReader fr = new FileReader(fileName); //문자데이터 스트림(입력소스 fileName)
			
			int data = 0;
			
			//FileInputStream을 이용
			while((data=fis.read()) != -1)
				System.out.print((char)data);
			System.out.println();
			fis.close(); //FileStream닫음
			
			String decodeVal = "";
			
			
			//FileReader이용
			while((data=fr.read()) != -1)
			{
				decodeVal = URLDecoder.decode(String.valueOf((char)data), "UTF-16");
				System.out.print(decodeVal);
			}
				
			System.out.println();
			fr.close(); //FileReader닫음
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
