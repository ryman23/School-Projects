import javax.swing.JFrame;

public class Game {
	public static void main(String args[]){
	
		// Create deck
		Deck d1 = new Deck();
		d1.populate();
		d1.shuffle();
		
		// Create playing hands
		Hand h1, h2, h3, dealer;
		h1 = new Hand();
		h2 = new Hand();
		h3 = new Hand();
		dealer = new Hand();
		Hand[] hands = {h1, h2, h3};
		
		// Deal cards to our hands
		d1.deal(hands, 2);
		
		// Deal cards to the dealer
		d1.deal(dealer, 2);
		
		// Show the players hand
		for(int i = 0; i < hands.length; i++){
			hands[i].flipCards();
			System.out.print(hands[i].showHand());
		}
		
		//Flip the dealer's first card
		dealer.cards.get(0).flipCard();
		
		// Show the dealer's cards
		System.out.println("Dealer's cards: \n" + dealer.showHand());
		
		// Call the GUI
		GUI gui = new GUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(500, 500);
		gui.setVisible(true);
	}
}
