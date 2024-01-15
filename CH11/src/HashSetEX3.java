import java.util.*;

public class HashSetEX3 {
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}


class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		
		Person tmp = (Person)obj; //다형성 이용
		
		return name.equals(tmp.name) && age == tmp.age;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
}
