import java.io.*;
import java.util.*;


public class Serial2 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//��ü ���� ���� ����� ������ ��ġ�ؾ� ��.
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)in.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
