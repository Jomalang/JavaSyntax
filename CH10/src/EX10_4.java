import java.util.Calendar;

public class EX10_4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2024, 1, 8);
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// roll()은 다른 필드에 영향을 주지 않는다.
		System.out.println("= 31일 후 = (roll)");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 7개월 전 = (roll)");
		date.roll(Calendar.MONTH, -7);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH)+
				"월"+date.get(Calendar.DATE)+"일";
		
	}

}
