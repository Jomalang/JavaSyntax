import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
