import java.util.*;

public class HashMapEX2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("조현진", new Integer(90));
		map.put("김민준", new Integer(100));
		map.put("화현준", new Integer(100));
		map.put("최원우", new Integer(80));
		map.put("조민준", new Integer(90));
		
		Set set = map.entrySet(); //entrySet의 반환값을 Set타입 set에 저장
		Iterator it = set.iterator(); //이후 iterator로 출력
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+", 점수 : "+e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : "+set); //키값만 반환할때
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext())
		{
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}

}
