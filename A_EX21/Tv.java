package A_EX21;

/**
 *
 * @author ADM
 */
public class Tv implements MetodosEletronicos {

    boolean ligado;

    public Tv(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("A TV esta ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("A TV esta desligando...");
    }

    @Override
    public void ObterStatus() {
        System.out.println("A tv esta ligada? " + ligado);
    }

}

class radio implements MetodosEletronicos {

    boolean ligado;

    public radio(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("O radio esta ligando...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("O radio esta desligando...");
    }

    @Override
    public void ObterStatus() {
        System.out.println("O radio esta ligado? " + ligado);
    }

}



