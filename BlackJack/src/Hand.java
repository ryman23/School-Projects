import java.util.ArrayList;

public class Hand {
	protected ArrayList<Card> cards;
	
	// Constructor
	public Hand(){
		cards = new ArrayList<Card>();
	}
	
	public void clear(){
		cards.clear();
	}
	public void add(Card card){
		cards.add(card);
	}
	public String showHand(){
		boolean allFaceUp = true;
		String str = "";
		for(Card c: cards){
			str += c.toString() + "\n";
			if(!c.isFaceUp){
				allFaceUp = false;
			}
		}
		// If all cards are face up, display the total
		if(allFaceUp){
			str += "Total points = " + getTotal() + "\n" + "\n";
		}
		return str;
	}
	public void flipCards(){
		for(Card c: cards){
			c.flipCard();
		}
	}
	
	public boolean give(Card card, Hand otherHand){
		if(!cards.contains(card)){
			return false;
		}
		else {
			cards.remove(card);
			otherHand.add(card);
			return true;
		}
	}
	public int getTotal(){
		int totalPoints = 0;
		boolean hasAce = false;
		
		for(int i = 0; i < cards.size(); i++){
			totalPoints += cards.get(i).getRank();
			
			// If card is an Ace
			if(cards.get(i).printRank() == "Ace"){
				hasAce = true;
			}
			// Make the Ace worth 11 if total points  <= 11
			if(hasAce && totalPoints <= 11){
				// Add 10 more (Ace already counts as 1)
				totalPoints += 10;
			}
		}
		return totalPoints;
	}
}