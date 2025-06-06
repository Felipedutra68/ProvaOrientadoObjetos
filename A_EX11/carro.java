package A_EX11;

/**
 *
 * @author ADM
 */
public class carro implements veiculo {

    @Override
    public void acelerar() {
        System.out.println("acelerando");
    }

    @Override
    public void frear() {
        System.out.println("freando");
    }

    @Override
    public void virar() {
        System.out.println("virando");
    }

}

class moto implements veiculo {

    @Override
    public void acelerar() {
        System.out.println("acelerando");
    }

    @Override
    public void frear() {
        System.out.println("freando");

    }

    @Override
    public void virar() {
        System.out.println("virando");

    }

}
