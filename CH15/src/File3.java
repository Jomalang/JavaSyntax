import java.io.*;
import java.util.ArrayList;

public class File3 {
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java File3 DIRECTORY");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		
		if(!dir.exists() || !dir.isDirectory())//������ ���ų�, �ش�Ǵ� ���丮�� ���� ���
		{
			System.out.println("not invalid file or directory");
			System.exit(0);
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("�� " +totalFiles+"���� ����");
		System.out.println("�� " +totalDirs+"���� ���丮");
	}//main
	
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+" ���丮");
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList(); //files�迭���� ���丮�� ��� �ε����鸸 ���� �����ϱ� ���� ����Ʈ, �Ŀ� ���ȣ�⶧ ����.
		
		for(int i = 0; i<files.length; i++)
		{
			String filename = files[i].getName();
			
			if(files[i].isDirectory())
			{
				filename = "["+filename+"]";
				subDir.add(i+""); 
			}
			System.out.println(filename);
		}	
			int dirNum = subDir.size();
			int fileNum = files.length - dirNum;
			
			totalFiles += fileNum; //����ƽ ������ �޼��� ��� �����ص� ���� ������ ����
			totalDirs += dirNum; //����ƽ ������ �޼��� ��� �����ص� ���� ������ ����
			
			System.out.println(fileNum + "���� ����" + dirNum + "���� ���丮");
			System.out.println();
			
			for(int j = 0; j < subDir.size(); j++) {
				int index = Integer.parseInt((String)subDir.get(j));
				printFileList(files[index]); //���� ���丮 ���� ���ȣ��
			}
	} //printFileList

}
