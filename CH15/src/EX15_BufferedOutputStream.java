import java.io.*;

public class EX15_BufferedOutputStream {

	public static void main(String[] args) {
		try {
			
			//파일 아웃풋스트림 생성
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			//보조스트림의 버퍼 크기 5로 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			//파일 123.txt에 1부터 9까지 출력
			for(int i = '1'; i<= '9'; i++) {
				fos.write(i);
			}
					
			
			fos.close();
		} catch (IOException e) {};
	}

}
