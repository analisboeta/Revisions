/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */

/**
 * The Guess a Number program consists of a game where both the player and the game generate random numbers as guesses
 * then compare to see who wins those guesses and who wins gets displayed.
 *
 * @author Ana Lourenço
 * @version 0.2
 * @since 2016-10-02
 */
public class Main {

    public static void main(String[] args) {


        public static final int MIN_CHOICE_LIMIT = 0;
        public static final int MAX_CHOICE_LIMIT = 10;

        Player p1 = new Player("Ana");
        Player p2 = new Player("João");

        Game game = new Game(3); // number of rounds as an argument

        game.start(p1, p2); // both players passed as arguments


    }
}

    /*
    temos duas classes essenciais, a *Player* e a *Game*. *Player*, para criarmos quantos jogadores quisermos,
    com um método *makeAGuess( )* (ou, dado que sois a turma dos nomes, o nome que entenderes melhor).
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
