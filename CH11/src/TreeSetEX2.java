import java.util.*;

public class TreeSetEX2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80,70,65,30,20,16,49,50};
		
		for(int i = 0; i <score.length; i++)
			set.add(new Integer(score[i]));
		
		System.out.println("50보다 작은 값 : "+set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : "+set.tailSet(new Integer(50)));
		System.out.println("40과 80사이의 값 : "+set.subSet(40,80));
	}

}
