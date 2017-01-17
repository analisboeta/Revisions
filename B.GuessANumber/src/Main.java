/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Main {


    Player[] gamePlayers = {
            new Player("Ana"),
            new Player("Banana"),
            new Player("Macaca"),
            new Player("Cigana")
    };

  Game game = new Game(gamePlayers.length);

  game.start();

}
