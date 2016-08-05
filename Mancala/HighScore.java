

import java.io.Serializable;

// serializable class for updating high scores
// List created with HighScore Handler class
public class HighScore implements Serializable {
	
	private String playerName; // user name
	private int turns;  // amount of turns it took to win
	private int score;  // amoun of stones won
	
	public HighScore() { // default constructor
		playerName = "";
		score = 0;
		turns = 0;
	}
	public HighScore( String name, int turnAmount, int winnerScore ) {
		
		playerName = name;
		turns = turnAmount;
		score = winnerScore;
	}
	// used for printing information from the list in a readable order
	public String toString() {

		String scoreString = getPlayerName() + "\t" + getTurns()  + "\t" + getScore();
		
		return scoreString;
	}
	// getters
	public String getPlayerName() { return playerName; }
	public int getTurns() { return turns; }
	public int getScore() { return score; }
	//public static int scoreCount() { return scoreCount; }
	
}
