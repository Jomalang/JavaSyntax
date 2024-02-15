import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\WorkSpace_Java\\CH15\\bin\\test.txt");
		String fileName = f.getName();
		int pos = fileName.indexOf(".");
		
		System.out.println("��θ� ������ �����̸� - "+f.getName());
		System.out.println("Ȯ���ڸ� ������ �����̸� - "+fileName.substring(0,pos));
		System.out.println("Ȯ���� - " +fileName.substring(pos+1));
		
		System.out.println("��θ� ������ �����̸� -"+f.getPath());
		System.out.println("������ ������ - "+f.getAbsolutePath());
		System.out.println("������ ���԰�� - "+f.getCanonicalPath());
		System.out.println("������ ���� �ִ� ���丮 - "+f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - "+File.pathSeparator);
		System.out.println("File.pathSeparatorChar - "+File.pathSeparatorChar);
		System.out.println("File.separator" +File.separator);
		System.out.println("FIle.separatorChar" +File.separatorChar);
		System.out.println();
		System.out.println("user.dir ="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = "+System.getProperty("sun.boot.class.path"));
		
	}

}