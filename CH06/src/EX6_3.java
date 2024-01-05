
class EX6_3 {
	public static void main(String args[]) {
		System.out.println("Card.width ="+Card.width);
		System.out.println("Card.width ="+Card.height);
		
		Card.height = 40;
		Card.width = 20;
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind + "," + c1.number + "이며,"
				+ "크기는" +"(" +Card.height+","+Card.width +")입니다.");
		System.out.println("c2은" + c2.kind + "," + c2.number + "이며,"
				+ "크기는" +"(" +Card.height+","+Card.width +")입니다.");
	}

}
