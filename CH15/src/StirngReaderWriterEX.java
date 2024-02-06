import java.io.*;


public class StirngReaderWriterEX {

	public static void main(String[] args) {
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData); //�ҽ� ���ڷ� ����
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data=input.read()) != -1)
				output.write(data); //data�� �� ��Ʈ������ ���ۿ����� �ϰ� �ִ�. 
		} catch (IOException e) {}
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.getBuffer().toString());
		System.out.println("Output Data : " + output.toString());
	}

}
