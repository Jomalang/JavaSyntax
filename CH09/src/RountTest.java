import java.util.ArrayList;

public class RountTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // JDK1.5이전에는 에러
		list.add(new Integer(100)); // ArrayList타입은 객체만 저장가능했음
		
		int i = list.get(0);
	
	}

}
