import java.io.*;
import java.util.Arrays;


public class EX15_1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //input을 위한 배열(버퍼역할)
		byte[] outSrc = null;
		byte[] temp = new byte[4]; //이전 예제오 배열 크기가 달라졌다.
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream(); //인자로 int형 size를 받을수도 있음
		
		System.out.println("Input Source     :"+Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
				int len = input.read(temp); //바뀐 부분
				output.write(temp, 0, len); //바뀐 부분
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch (IOException e) {}	
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp             :"+Arrays.toString(temp));
		System.out.println("Output Source    :"+Arrays.toString(outSrc));
		
	}
}

