import java.util.Calendar;

public class EX10_5 {
	public static void main(String[] args) {
		if(args.length != 2)
		{
			System.out.println("Usage : java EX10_5 2024 1");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; //1일이 무슨 요일인지
		int END_DAY = 0; // 마지막 날이 몇일인지
		
		Calendar sDAY = Calendar.getInstance(); //시작일
		Calendar eDAY = Calendar.getInstance(); //끝 일
		
		//월의 경우 0부터 11까지의 값을 가지므로 1을 빼주어야 한다.
		sDAY.set(year, month-1, 1); //입력 월의 1일 설정
		eDAY.set(year, month, 1); //입력월의 말일 설정
		
		// 다음달의 첫날에서 하루를 빼서 현재달의 마지막 날을 구한다.
		eDAY.add(Calendar.DATE, -1);
		
		//1일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDAY.get(Calendar.DAY_OF_WEEK);
		
		// eDAY에 지정된 날짜를 얻어온다.
		END_DAY = eDAY.get(Calendar.DATE);
		
		System.out.println("      " + year + "년" + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		
		// 해당 월의 1일이 어느 요일인지에 따라서 공백 출력
		for(int i = 1; i < START_DAY_OF_WEEK; i++)
			System.out.print("   ");
		
		// 시작일부터 마지막 일까지 1일씩 증가시키면서 일을 출력
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++)
		{
			System.out.print((i < 10) ? "  "+i : " "+i);
			if(n%7 == 0) //1주일마다 줄바꿈
				System.out.println(); 
		}
		
	}
}
