import java.io.*;
import java.util.Arrays;


public class EX15_1 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //input�� ���� �迭(���ۿ���)
		byte[] outSrc = null;
		byte[] temp = new byte[4]; //���� ������ �迭 ũ�Ⱑ �޶�����.
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream(); //���ڷ� int�� size�� �������� ����
		
		System.out.println("Input Source     :"+Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
				int len = input.read(temp); //�ٲ� �κ�
				output.write(temp, 0, len); //�ٲ� �κ�
				
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

