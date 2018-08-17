
public enum Suit {
	// Declare card suits
	HEARTS("Hearts"),
	SPADES("Spades"),
	DIAMONDS("Diamonds"),
	CLUBS("Clubs");
	
	// Private Field
	private final String suitText;
	
	// Constructor
	private Suit(String suitText){
		this.suitText = suitText;
	}
	
	// Public method
	public String printSuit(){
		return suitText;
	}
}