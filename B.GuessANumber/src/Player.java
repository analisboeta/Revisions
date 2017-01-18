/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */
public class Player {

    private String name;
    private int playerBet;
    private boolean isRoundWinner;


    public Player(String name) {
        this.name = name;
    }


    //------------------------------------------------
    public boolean isRoundWinner() {
        return isRoundWinner;
    }

    public void setRoundWinner(boolean roundWinner) {
        isRoundWinner = roundWinner;
    }

    //--------------------------------------------------
    public int makeAGuess(int maxGuess) {  // this method substitute the traditional setPlayerBet

        this.playerBet = RNGenerator.getRandomNumber(maxGuess);
        return playerBet;
    }

    public int getPlayerBet() {
        return playerBet;
    }

    //-----------------------------------------------------
    @Override
    public String toString() {
        return "Player " + name;
    }
}





    /*
    temos duas classes essenciais, a *Player* e a *Game*.
    A classe *Game* é uma espécie de dealer ou croupier ou casa, ou outro calão de casino que te sirva melhor.
    Entre as suas tarefas estão, *chooseNumber( )*, para escolher o número que está em jogo; *compare( )*,
    para verificar se o jogador acertou; e *startGame(Player player)*, que recebe um jogador (na versão mais simples
    cada jogo só tem um player), e que terá o loop normal do jogo. Qualquer coisa como *while (ninguém adivinhar)*,
    etc. Na classe *Main* apenas queremos instanciar um *Player p1*, um *Game g1*, e fazer o
    jogo rolar com *g1.startGame(p1)*.

    nesta fase só nos devemos preocupar com a lógica do jogo propriamente dita, e não com inputs de eventuais
     utilizadores do programa. Portanto combinámos que as guesses do player serão também geradas aleatoriamente

    A classe *RandomGenerator* é uma classe utilitária. Com um método getRandom(int min, int Max),
    para não estarmos sempre a criar a linha Math.Random, etc etc
     */
