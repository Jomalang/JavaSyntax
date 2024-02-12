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
		
		if(!dir.exists() || !dir.isDirectory())//파일이 없거나, 해당되는 디렉토리가 없을 경우
		{
			System.out.println("not invalid file or directory");
			System.exit(0);
		}
		
		printFileList(dir);
		
		System.out.println();
		System.out.println("총 " +totalFiles+"개의 파일");
		System.out.println("총 " +totalDirs+"개의 디렉토리");
	}//main
	
	
	public static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+" 디렉토리");
		File[] files = dir.listFiles();
		
		ArrayList subDir = new ArrayList(); //files배열에서 디렉토리가 담긴 인덱스들만 따로 저장하기 위한 리스트, 후에 재귀호출때 사용됨.
		
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
			
			totalFiles += fileNum; //스태틱 변수라서 메서드 계속 실행해도 값이 변하지 않음
			totalDirs += dirNum; //스태틱 변수라서 메서드 계속 실행해도 값이 변하지 않음
			
			System.out.println(fileNum + "개의 파일" + dirNum + "개의 디렉토리");
			System.out.println();
			
			for(int j = 0; j < subDir.size(); j++) {
				int index = Integer.parseInt((String)subDir.get(j));
				printFileList(files[index]); //하위 디렉토리 대한 재귀호출
			}
	} //printFileList

}
