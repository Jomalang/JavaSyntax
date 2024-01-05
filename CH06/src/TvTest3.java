
class TvTest3 {
	public static void main(String args[]) {
		TV[] tvArr = new TV[3]; // 길이 3인 TV객체배열
		
		for(int i = 0; i < 3; i++)
		{
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;
		}
		
		for(int i = 0; i < tvArr.length; i++)
		{
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		} 
}
}
