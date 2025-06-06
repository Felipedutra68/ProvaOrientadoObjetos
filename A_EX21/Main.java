package A_EX21;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Tv Dis = new Tv(true);

        Dis.ligar();
        Dis.desligar();
        Dis.ObterStatus();

        radio r = new radio(true);

        r.ligar();
        r.desligar();
        r.ObterStatus();

        

    }

}
