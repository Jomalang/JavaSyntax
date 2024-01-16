import java.util.*;

public class EXTreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet(); //정렬 필요 없음 빠져나올때 알아서 정렬됨.
		
//		for (int i = 0; set.size() < 6; i++) {
//			int num = (int)(Math.random()*45+1);
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
//		}
		System.out.println(set);
//		List list = new LinkedList(set); // LinkedList(Collection C)
//		Collections.sort(list);			 // Collectoins.sort(List list)
//		System.out.println(list);
	}
}

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		return 1;
	}
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}
	
}
