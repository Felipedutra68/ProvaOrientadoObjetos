package A_EX9;

/**
 *
 * @author ADM
 */
public class Poupanca extends conta{
    
    public Poupanca(int saldoT) {
        super(saldoT);
    }
    
   
     public void rendimento() {
     double r = saldoT *0.01;
        System.out.println("O rendimento mensal eh de " +r);
    }

}
