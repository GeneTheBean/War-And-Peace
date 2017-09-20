
public enum CardSuit { 
	CLUBS("Clubs"), DIAMONDS("Diamonds"), HEARTS("Hearts"), SPADES("Spades");
	String suit;
	
	CardSuit(String suit){
		this.suit = suit;
	}
	
	public String getSuit(){
		return suit;
	}
}
