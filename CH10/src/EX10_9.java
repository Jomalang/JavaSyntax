import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EX10_9 {

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2024년 1월 8일");	
			System.out.println(df2.format(d));
		} catch (Exception e) {
		}
	}

}
