class Time {
	private int hour; //0~23������ ���� ������ ��.
	private int minuet;
	private int second;
	
	public void setHour(int hour) {
		if(isnotValidHour(hour)) return;
		this.hour = hour;
	}
	//�Ű������� �Ѿ�� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
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
