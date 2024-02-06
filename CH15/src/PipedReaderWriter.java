import java.io.*;

public class PipedReaderWriter {

	public static void main(String[] args) {
		InputThread inThread = new InputThread("InputThread");
		OutputThread outThread = new OutputThread("OutputThread");
		
		//PipedReader와 PipedWriter를 연결
		inThread.connect(outThread.getOutput());
		
		inThread.start();
		outThread.start();
	}

}


class InputThread extends Thread {
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name) {
		super(name); //조상인 Thread(String name)가져옴.
	}
	
	public void run() {
		try {
			int data = 0;
			
			while((data = input.read()) != -1) { //PipedReader에서 읽어옴.(PipedWriter랑 연결되어있음)
				sw.write(data); //data에 있는 내용을 StringWriter로 sw에 씀.
			}
			
			System.out.println(getName() +"received : "+sw.toString());	
		} catch (IOException e) {}
	}//run()
	
	public PipedReader getInput() {
		return input;
	}
	
	public void connect(PipedWriter output) {
		try {
			input.connect(output); //PipedReader input.connect()호출, 인자로 받은 output에 연결
		} catch (IOException e) {}
	}//connect
}

class OutputThread extends Thread {
	PipedWriter output = new PipedWriter();
	
	OutputThread(String name) {
		super(name);
	}
	
	public void run () {
		try {
			String msg = "Hello";
			System.out.println(getName() + " sent : " +msg);
			output.write(msg); //PipedWriter에 msg에 담긴 문자열 씀.
			output.close();
		} catch (IOException e) {}
	} //run
	
	public PipedWriter getOutput() {
		return output;
	}
	
	public void connect(PipedReader input) {
		try {
			output.connect(input);
		} catch (IOException e) {}
	}
}
