import java.io.*;


public class StirngReaderWriterEX {

	public static void main(String[] args) {
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData); //소스 인자로 전달
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data=input.read()) != -1)
				output.write(data); //data가 두 스트림간의 버퍼역할을 하고 있다. 
		} catch (IOException e) {}
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.getBuffer().toString());
		System.out.println("Output Data : " + output.toString());
	}

}
