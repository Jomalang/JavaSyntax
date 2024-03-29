import java.io.*;

public class EX8_10 {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"다시 입력해주시기 바랍니다.");
		}
	}
	static File createFile(String fileName) throws Exception {
		try {
			if (fileName==null || fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
			
		} catch (Exception e) {
			fileName = "제목없음.txt";
		}
		
		File f = new File(fileName); // File클래스 객체 생성
		f.createNewFile(); //File객체의 createNewFile메서드 사용
		return f;//생성된 File객체 참조변수 반환
	}
}

