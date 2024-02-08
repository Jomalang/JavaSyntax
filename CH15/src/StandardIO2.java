import java.io.*;
public class StandardIO2 {

	public static void main(String[] args) {
		PrintStream ps = null; //보조 스트림
		FileOutputStream fos = null; //기반스트림
		
		try {
			fos = new FileOutputStream("output.txt"); //출력 소스 설정
			ps = new PrintStream(fos); //기반스트림 연결해 보조스트림 생성
			System.setOut(ps); //출력 소스를 콘솔에서 ps로 변경
			
		} catch (FileNotFoundException e) {
			System.out.println("file not founded");
		}
		
		System.out.println("Hello by system.out");
		System.err.println("Hello by system.err");
	}

}
