
public class PeaceCard extends Card {
	
	public PeaceCard(CardSuit suit, CardValue value){
		super(suit,value);
	}
	
	@Override
	public boolean winner(Card c){

		if(value.getValue()==c.value.getValue()&&getSuit().compareTo(c.getSuit())<0)
			return true;
		
		else if(getSuit().compareTo(c.getSuit())<0){
			if(value.getValue()<c.value.getValue())
				return true;
			else if(value.getValue()>c.value.getValue())
				return false;
		}
		
		else if(getSuit().compareTo(c.getSuit())>0){
			if(value.getValue()<c.value.getValue())
				return true;
			if(value.getValue()<c.value.getValue())
				return true;
			else return 
				false;
		}
		
	    else if(getSuit().compareTo(c.getSuit())==0){
			if(value.getValue()<c.value.getValue())
				return true;
			else 
				return false;
			}
		return false;
	}
}

