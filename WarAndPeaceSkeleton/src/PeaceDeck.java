import java.util.ArrayList;


public class PeaceDeck extends Deck {
	ArrayList<PeaceCard> deck = new ArrayList<PeaceCard>();
	
	public PeaceDeck(){
		int k = 0;
		for(CardSuit i: CardSuit.values()){
			for(CardValue j: CardValue.values()){
				deck.add(new PeaceCard(i,j));
				k++;
			}
		}
	}
		
	public PeaceCard draw() {
		PeaceCard c; 
		int index = (int)(Math.random()*Math.random()*scope);
		c = deck.get(index);
		deck.remove(index);
		scope--;
		return c;
	}
}


	

	
