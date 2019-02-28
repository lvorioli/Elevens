/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String ranks[] = new String[] {"A", "B", "C"};
		String suits[] = new String[] {"Cat", "Dog"};
		int pointValues[] = new int[] {1, 2, 3};
		
		Deck deck1 = new Deck(ranks, suits, pointValues);
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		
	}
}
