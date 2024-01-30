import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class EX14_2 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1; //1~100���� ����
		Consumer<Integer> c = i -> System.out.print(i+", ");
		Predicate<Integer> p = i -> i%2 == 0; //¦������ �˻��Ѵ�.
		Function<Integer, Integer> f = i -> i/10*10; //i�� �����ڸ� ���ش�.
		
		List<Integer> list = new ArrayList<Integer>();
		
		makeRandomList(s, list); //list�� ���������� ä��.
		System.out.println(list);
		
		printEvenNum(p, c, list); //list���� ¦���� �����.
		
		List<Integer> newList = doSomeThing(f, list); //�� ����Ʈ ��ȯ
		System.out.println(newList);
		
		String str1 = new String("abc");
		String str2 = new String("cba");
		
		Predicate<String> p2 = Predicate.isEqual(str1);
		Boolean result = p2.test(str2);
		System.out.println(result);
	}
	
	static <T> List<T> doSomeThing(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i));
		}
		
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) { //¦������ �˻�
				c.accept(i); //¦���̸� �����.
			}
		}
		System.out.println("]");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i = 0; i < 10; i++)
			list.add(s.get());
	}
}
