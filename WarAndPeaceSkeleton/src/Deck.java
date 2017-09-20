import java.util.ArrayList;


public class Deck {
	protected ArrayList<Card> deck = new ArrayList<>();
	protected int scope = 52;
	
    public Deck() {
		
		int k = 0;
		for(CardSuit i: CardSuit.values()){
			for(CardValue j: CardValue.values()){
				deck.add(new Card(i,j));
				k++;
			}
		}
	}
	
	public Card draw() {
		Card c; 
		
		int index = (int)(Math.random()*Math.random()*scope);
		c = deck.get(index);
		deck.remove(index);
		scope--;
		return c;
	}
}
