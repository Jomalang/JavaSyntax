import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX15_0 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		try {
		//기반 스트림 생성
			FileInputStream fis = new FileInputStream("test.txt");
		// 보조스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			bis.read();
			
		} catch (FileNotFoundException e) {}
		
	}

}
