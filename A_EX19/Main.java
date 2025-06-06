package A_EX19;

import EX4_EX11_jogos.*;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Tabuleiro t = new Tabuleiro();

        t.iniciar();

        t.jogar();

        t.finalizar();

        

        videoGame v = new videoGame();

        v.iniciar();

        v.jogar();

        v.finalizar();

    }

}
