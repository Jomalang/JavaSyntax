
enum Direction { EAST, SOUTH, WEST, NORTH}

public class EX12_5 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		//Enum클래스의 valueOf 직접 사용... Direction.class는 Direction클래스객체를 반환함.
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		
		System.out.println("d1==d2? " + (d1==d2));
		System.out.println("d1==d3? " + (d1==d3));
		
		System.out.println("d1.equals(d3)? "+d1.equals(d3));
//		System.out.println("d2 > d3 ? "+d2 > d3); //에러
		System.out.println("d1.compareTo(d2)? "+ d1.compareTo(d2));
		System.out.println("d1.compareTo(d3)? "+ d1.compareTo(d3));
		
		switch(d1) {
		case EAST: // Direction.EAST라고 적지 않는다.
			System.out.println("The direction is EAST");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH");
			break;
		case WEST:
			System.out.println("The direction is WEST");
			break;
		case NORTH:
			System.out.println("The direction is NORTH");
			break;
		}
		
		Direction[] darr = Direction.values(); //열거형의 모든 상수 배열로 반환
		
		for(Direction d : darr)
			System.out.printf("%s=%d\n", d.name(), d.ordinal());
	}
}
