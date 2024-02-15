import java.io.*;

public class File9 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java File9 DIRECTORY");
			System.out.println(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		File[] list = dir.listFiles();
		
		for(int i = 0; i< list.length; i++) {
			String filename = list[i].getName();
			//���ϸ�
			String newfileName = "0000" + filename;
			newfileName = newfileName.substring(newfileName.length()-8);
			list[i].renameTo(new File(dir, newfileName));
		}
		
	}

}
