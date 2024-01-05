class Time {
	private int hour; //0~23사이의 값을 가져야 함.
	private int minuet;
	private int second;
	
	public void setHour(int hour) {
		if(isnotValidHour(hour)) return;
		this.hour = hour;
	}
	//매개변수로 넘어온 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isnotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour()
	{
		return hour;
	}
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(19);
		System.out.println(t.getHour());
	}

}
