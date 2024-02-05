import java.io.*;
import java.util.Arrays;

public class EX15_DataOutputStream2 {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		
		byte[] result = null;
		
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			
			String[] hex = new String[result.length];
			
			for(int i = 0; i<result.length; i++) {
				if(result[i] < 0)
					hex[i] = String.format("%02x", result[i]);
				else {
					hex[i] = String.format("%02x", result[i]);
				}
			}
			
			System.out.println("10진수 : " +Arrays.toString(result)); //원본 바이트 배열
			System.out.println("16진수 : " +Arrays.toString(hex)); // for문으로 가공한 바이트 배열
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
