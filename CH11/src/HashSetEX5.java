import java.util.*;

public class HashSetEX5 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		
		//교집합
//		setA.retainAll(setB);
		
		
		//차집합
//		setA.addAll(setB);
		
		
		//합집합
		setA.removeAll(setB);
		
		
//		System.out.println("Kyo = "+setA);
		System.out.println("Cha = "+setA);
//		System.out.println("Hab = "+setA);
	}

}
