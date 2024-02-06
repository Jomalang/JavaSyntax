import java.util.Date;


public class EX15_PrintStream {

	public static void main(String[] args) {
		int i = 65;
		float f = 1234.56789f;
		Date d = new Date(); // 날짜 관련 가장 최신 클래스는 time이다.
		
		System.out.printf("문자 %c의 코드는 %d\n",i, i);
		System.out.printf("%d는 8진수로 %o, 16진수로 %x\n",i,i,i);
		System.out.printf("%3d%3d%3d\n", 100, 90, 80);
		System.out.println();
		System.out.printf("123456789012345678901234567890\n");
		System.out.printf("%s%-5s%5s\n","123","123","123");
		System.out.println();
		System.out.printf("%-8.1f%8.1f %e\n",f,f,f);
		System.out.println();
		System.out.printf("오늘은 %tF입니다.\n", d);
		System.out.printf("지금은 %tH시 %tM분 %tS초 입니다.\n",d,d,d);
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다.\n", d);
		
		
	}

}
