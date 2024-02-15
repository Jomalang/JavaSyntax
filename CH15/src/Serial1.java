import java.io.*;
import java.util.ArrayList;

public class Serial1 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "5678", 32);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);
			
			//직렬화
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close(); //사용후 스트림 닫아준다.
			
			System.out.println("직렬화 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
