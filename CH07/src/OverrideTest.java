class Mypoint3 {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+", y:" +y;
	}
}

class Mypoint3d extends Mypoint3 {
	int z;
	
	Mypoint3d(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	String getLocation() {
		return "x:"+x+", y:" +y+", z:"+z;
	}
	public String toString() {
		return "x:"+x+", y:" +y+", z:"+z;
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		Mypoint3d P3 = new Mypoint3d(3, 5, 7);
		System.out.println(P3);
	}
}
