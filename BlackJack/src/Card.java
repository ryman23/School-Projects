
public class Card {
	// Private fields
	private Suit suit;
	private Rank rank;
	boolean isFaceUp;
	
	// Constructor
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
		this.isFaceUp = true;
	}
	
	// Public methods
	public String getSuit(){
		return suit.printSuit();
	}
	public int getRank(){
		return rank.getRank();
	}
	public String printRank(){
		return rank.printRank();
	}
	public void flipCard(){
		isFaceUp = !isFaceUp;
	}
	public String toString(){
		String str = "";
		
		if(isFaceUp){
			str += rank.printRank() + " of " + suit.printSuit();
			return str;
		}
		else {
			str = "Face down";
		}
		return str;
	}
}