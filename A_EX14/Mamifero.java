package A_EX14;

/**
 *
 * @author ADM
 */
public class Mamifero extends animal{

    public Mamifero(String tipoPelo) {
        super(tipoPelo);
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    //A heranca ajuda a repetir multiplos atributos varias vezes em varios codigos diferentes utilizando o comando extendsau lado da classe em que quer usar os atributos
    
}
