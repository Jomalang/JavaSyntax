import java.util.stream.Stream;

public class EX14_0 {

	public static void main(String[] args) {		

//		Function<String, Integer> f = (String s) -> Integer.parseInt(s); 
//		Function<String, Integer> f = Integer::parseInt;
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		System.out.println(f.apply("100")+200);
		
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = MyClass::new;
//		Function<Integer, MyClass> s = MyClass::new;
//		System.out.println(s.apply(100).iv);
		
//		Function<Integer, int[]> arr = int[]::new;
//		System.out.println(arr.apply(10).length);
//		
		String[] strArr = {"aaa", "ddd", "ccc"};
//		List<String> strList = Arrays.asList(strArr);
		
//		Stream<String> strStream1 = strList.stream();
//		strStream1.sorted().forEach(System.out::print);
//		System.out.println();
//		
//		strStream1 = Arrays.stream(strArr);
//		strStream1.sorted().forEach(System.out::print);
		
//		Stream<String> strS = Arrays.stream(strArr, 0, 3);
//		strS.forEach(System.out::println);
//		
//		Stream<String> strArr2 = Stream.of("a", "b", "c");
//		strArr2.forEach(System.out::print);
//		
//		System.out.println();
//		
//		Stream<String> strArr3 = Stream.of(new String[] {"d", "e", "f"});
//		strArr3.forEach(System.out::print);
//		
//		System.out.println();
//		
//		int[] intArr = {1,2,3,4,5};
//		IntStream intStr = Arrays.stream(intArr);
//		System.out.println("sum="+intStr.average());
		
//		IntStream intStream = new Random().ints(20, 100, 200);
//		intStream.forEach(System.out::println);
		
//		Stream<Integer> intStream = Stream.iterate(0, n->n+1);
//		intStream.limit(100).forEach(System.out::println);
		
		Stream<Integer> intStream2 = Stream.generate(()->1);
		intStream2.limit(10).forEach(System.out::println);
	}
	
}
//
//class MyClass {
//	int iv;
//	
//	MyClass(int iv) {
//		this.iv = iv;
//	}
//}
//
//@FunctionalInterface //�Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ���´�.
//interface MyFunction {
//	public abstract int max(int a, int b);
//}
