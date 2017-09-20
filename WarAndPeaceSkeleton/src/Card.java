
public class Card {
	protected CardSuit suit;
	protected CardValue value;
	
	Card(CardSuit suit, CardValue value){
		this.suit = suit;
		this.value = value;
	}

	public CardValue getValue(){
		return value;
	}
	
	public CardSuit getSuit(){
		return suit;
	}

	public String toString() {
		String temp = "";
		if(value.getValue()==11) temp+="Jack";
		else if(value.getValue()==12) temp+="Queen";
			else if(value.getValue()==13) temp+="King";
				else if(value.getValue()==14) temp+="Ace";
					else temp += value.getValue(); 
		temp += " of ";
		temp += suit.getSuit();
		return temp;
	}
	
	public boolean winner(Card c){
		if(getSuit().compareTo(c.getSuit())>0)
			return true;
		
		else if(getSuit().compareTo(c.getSuit())<0)
			return false;
		
		else{	
			if(value.getValue()==c.value.getValue())
				return false;
		
			else if(value.getValue()>c.value.getValue())
				return true;
			
			else 
				return false;
	    }
	}
}
