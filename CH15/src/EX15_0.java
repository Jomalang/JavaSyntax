import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX15_0 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		try {
		//��� ��Ʈ�� ����
			FileInputStream fis = new FileInputStream("test.txt");
		// ������Ʈ�� ����
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			bis.read();
			
		} catch (FileNotFoundException e) {}
		
	}

}
