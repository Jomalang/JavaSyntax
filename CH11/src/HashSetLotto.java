import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45+1);
			set.add(num);
		}
		
		System.out.println(set);
		List list = new LinkedList(set); // LinkedList(Collection C)
		Collections.sort(list);			 // Collectoins.sort(List list)
		System.out.println(list);
	}

}
