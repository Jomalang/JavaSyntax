import java.io.*;

class BufferedReader1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("BufferedReader1.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line ="";
			
			for(int i = 1; (line = br.readLine()) != null; i++)
			{
				if(line.indexOf(";") != -1)
					System.out.println(i+":"+line);
			}
				
			br.close();
		} catch (IOException e) {}
	}

}
