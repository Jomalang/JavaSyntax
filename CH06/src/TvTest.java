class TV {
	String color;
	boolean power;
	int channel;
	
	void power() 
	{
		power = !power;
	}
	void channelUp() 
	{
		++channel;
	}
	void channelDown() 
	{
		--channel;
	}
}


class TvTest{
	public static void main(String arg[]) {
		TV t;
		t = new TV();
		t.channel =7;
		t.channelDown();
		t.channelDown();
		t.channelDown();
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");
	}
}