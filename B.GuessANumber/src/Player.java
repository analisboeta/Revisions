/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Player {

    private String name;
private int currentBet;

    public Player(String name) {
        this.name = name;
    }

    public int guess(int maxGuess) {

        return RNGenerator.getRandomNumber(maxGuess);
    }
}
