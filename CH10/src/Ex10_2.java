import java.util.Calendar;

public class Ex10_2 {
	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에 [0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "월","화","수","목","금","토","일"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// 달은 0부터 시작하기 때문에 -1을 해서 지정해야 한다.
		date1.set(2023, 5, 30);
		System.out.println("전역일은"+ toString(date1)+DAY_OF_WEEK
				[date1.get(Calendar.DAY_OF_WEEK)]+"요일이고,");
		System.out.println("오늘은"+toString(date2)+DAY_OF_WEEK
				[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		
		//두 날짜간의 차이를 얻으려면 getTimeInMillis()를 사용해 천분의 일초 단위로 변환해야 한다.
		long difference =
				(date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("전역일로부터 지금까지" + difference+"초가 지났습니다.");
		System.out.println("일로 계산하면"+difference/(24*60*60)+"일입니다.");
		// 1일 = 24*60*60
	}
	
		//toString 오버라이딩
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)
					+"월"+date.get(Calendar.DATE)+"일";
		}
	}	


