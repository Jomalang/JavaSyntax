import java.util.Calendar;

public class EX10_4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2024, 1, 8);
		
		System.out.println(toString(date));
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// roll()�� �ٸ� �ʵ忡 ������ ���� �ʴ´�.
		System.out.println("= 31�� �� = (roll)");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 7���� �� = (roll)");
		date.roll(Calendar.MONTH, -7);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+date.get(Calendar.MONTH)+
				"��"+date.get(Calendar.DATE)+"��";
		
	}

}