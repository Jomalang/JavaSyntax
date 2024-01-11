import java.util.ArrayList;
import java.util.Collections;

public class EX11_1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		//기본길이 10인 ArrayList 생성
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		//sublist로 반환된 배열은 읽기전용이기 때문에, 반환값을 새로운 배열에 담는다.
		//ArrayList(Collection c)
		print(list1, list2);
		
		Collections.sort(list1); //list1과 list2 정렬
		Collections.sort(list2);
		print(list1, list2);
		
		//list1이 list2의 모든 요소를 포함하는지 확인
		System.out.println("list1.containsALL(list2) :"
				+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("index="+list1.indexOf(1));
		
		list1.remove("1");
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분 남기고 나머지 삭제
		System.out.println("list1.retainAll(list2) :"
				+list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체 삭제
		for(int i = list2.size()-1; i >=0 ; i--) {
			if(list1.contains(list2.get(i))) //get은 해당 인덱스의 값 가져온다.
				list2.remove(i);
			print(list1, list2);		}		
	}

	
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+ list1);
		System.out.println("list2:"+ list2);
		System.out.println();
	}
}
