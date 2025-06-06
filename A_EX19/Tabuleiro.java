package A_EX19;

import EX4_EX11_jogos.*;

/**
 *
 * @author ADM
 */
public class Tabuleiro implements jogadas {

    public Tabuleiro() {
    }

    @Override
    public void iniciar() {
        System.out.println("O jogo comecou");
    }

    @Override
    public void jogar() {
        System.out.println("Rolando dados: deu 20");
    }

    @Override
    public void finalizar() {
        System.out.println("Finnalizando o jogo");
    }

}


class videoGame implements jogadas {

    public videoGame() {
    }

    @Override
    public void iniciar() {
        System.out.println("O jogo comecou");
    }

    @Override
    public void jogar() {
        System.out.println("atirando");

    }

    @Override
    public void finalizar() {
        System.out.println("Finnalizando o jogo");

    }

}
