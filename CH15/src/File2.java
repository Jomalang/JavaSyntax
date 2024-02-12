import java.io.*;

public class File2 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java File2 DIRECTORY");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory())//������ ���ų�, �ش�Ǵ� ���丮�� ���� ���
		{
			System.out.println("not invalid file or directory");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i<files.length; i++) {
			String filesName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+filesName+"]" : filesName);
		}
	}

}
