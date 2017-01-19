/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */


public class Game {

    public static final int MIN_CHOICE_LIMIT = 0;
    public static final int MAX_CHOICE_LIMIT = 10;


    private int numberOfRounds;
    private int gameBet;
    private Player p1;
    private Player p2;

    public Game(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }


    public void start(Player p1, Player p2) {

        this.p1 = p1;
        this.p2 = p2;

        int roundCounter = numberOfRounds;
        while (roundCounter > 0) {

            System.out.println(roundCounter);
            chooseNumber();
            compareNumber();
            roundCounter--;

        }

        if (p1.getRoundsWon() > p2.getRoundsWon()) {
            System.out.println("\nEND RESULT: Player One WINS THE GAME!");
        } else if (p1.getRoundsWon() < p2.getRoundsWon()) {
            System.out.println("\nEND RESULT: Player Two WINS THE GAME!");
        } else {
            System.out.println("\nEND RESULT: It's a tie!! SUCKERS!");
        }

        System.out.println("Player1 SCORE: " + p1.getRoundsWon() +
                "\tPlayer2 SCORE: " + p2.getRoundsWon());
    }

    private void compareNumber() {
        int p1Guess = p1.makeAGuess();
        int p2Guess = p2.makeAGuess();

        if (p1Guess > gameBet && p2Guess > gameBet) {
            p1.setRoundsWon();
            p2.setRoundsWon();
            System.out.println("It's a tie, each player gets a point!");

        } else if (p1Guess > gameBet) {
            p1.setRoundsWon();
            System.out.println("Player 1 wins this round! \t" +
                    "Total number of rounds won by player 1: " + p1.getRoundsWon());
        } else if (p2Guess > gameBet) {
            p2.setRoundsWon();
            System.out.println("Player 2 wins this round! \t" +
                    "Total number of rounds won by player 2: " + p2.getRoundsWon());

        } else {
            System.out.println("No one won!");
        }

    }


    public int chooseNumber() {

        gameBet = RNGenerator.getRandomNumberInRange(MIN_CHOICE_LIMIT, MAX_CHOICE_LIMIT);
        return gameBet;
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

