
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {
		Card temp1;
		Card temp2;
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0, turn = 1;
		
		for(int i=0;i<HANDS;i++){
			temp1 = player1.draw();
			temp2 = player2.draw();
		
			if(temp1.winner(temp2)){
				System.out.println("Turn " + turn + ": player1 wins! " + temp1 + " beats " + temp2);
				player1Score++;
				turn++;
			}
			else if(!temp1.winner(temp2) && temp1.toString().equals(temp2.toString())){
				System.out.println("Turn " + turn + ": Tie! " + temp1 + " draws " + temp2);
				turn++;
			}
			else{
				System.out.println("Turn " + turn + ": player2 wins! " + temp2 + " beats " + temp1);
				player2Score++;
				turn++;
			}
		}
		System.out.print("WAR: ");
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
	}
}