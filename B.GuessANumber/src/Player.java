/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Player {

    private String name;
    private int playerBet;
    private int roundsWon = 0;

    public Player(String name) {
        this.name = name;
    }

    public int makeAGuess() {  // this method substitutes the traditional setPlayerBet

        this.playerBet = RNGenerator.getRandomNumberInRange(Game.MIN_CHOICE_LIMIT, Game.MAX_CHOICE_LIMIT);
        return playerBet;
    }

    public void setRoundsWon() {
        this.roundsWon += 1;
    }

    public int getRoundsWon() {
        return roundsWon;
    }
}
