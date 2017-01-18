/**
 * Created by Ana Lourenco on 15/01/17 -  Revisions project.
 */


public class Game {

    // Properties
    private int numberOfRounds;
    private int gameBet;

    //---------------------------------------------
    //constructor
    public Game(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    //-----------------------------------------------
    //methods
    public void start(Player p1, Player p2) {


        int i = 1;
        while (int i <=numberOfRounds){

            chooseNumber();
            compareNumber();
            i++;

        }

    }


    public int chooseNumber() {

       RNGenerator.getRandomNumberInRange(MIN_CHOICE_LIMIT, )

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
