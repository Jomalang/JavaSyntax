class Tv{
	Boolean power; //���� ����
	int channel; //ä�� ��ȣ
	
	void power() { power = !power;} //���� ����
	void channelup() { channel++;}
	void channeldown() { channel--;}
}

class SmartTv extends Tv2 { //SmartTv�� ĸ�� �����ֱ� ��� �߰�
		boolean caption = false;
		void displayCaption(String text)
		{
			if(caption) //caption����������
			{
				System.out.println(text); //�ؽ�Ʈ �����ֱ�
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
