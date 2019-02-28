/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Ace", "Club", 14);
		Card card2 = new Card("5", "Heart", 5);
		Card card3 = new Card("9", "Diamond", 9);
		Card card4 = new Card("9", "Diamond", 9);
		
		System.out.println(card1.suit());
		System.out.println(card2.suit());
		System.out.println(card3.suit());
		
		System.out.println(card1.rank());
		System.out.println(card2.rank());
		System.out.println(card3.rank());
		
		System.out.println(card1.pointValue());
		System.out.println(card2.pointValue());
		System.out.println(card3.pointValue());
		
		System.out.println(card3.matches(card4));
		System.out.println(card3.matches(card1));
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		
	}
}
