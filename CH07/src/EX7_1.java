class Tv{
	Boolean power; //전원 상태
	int channel; //채널 번호
	
	void power() { power = !power;} //전원 끄기
	void channelup() { channel++;}
	void channeldown() { channel--;}
}

class SmartTv extends Tv2 { //SmartTv는 캡션 보여주기 기능 추가
		boolean caption = false;
		void displayCaption(String text)
		{
			if(caption) //caption켜져있으면
			{
				System.out.println(text); //텍스트 보여주기
			}
		}
}

public class EX7_1 {
	public static void main(String args[]) {
		SmartTv st = new SmartTv();
//		st.channel = 10;
//		st.channelup();
//		System.out.println(st.channel);
		st.displayCaption("hello, wolrd");
		st.caption = true;
		st.displayCaption("hello, world");
	}

}
