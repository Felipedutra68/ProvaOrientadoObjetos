package A_EX28;

/**
 *
 * @author ADM
 */
public class ContaInvestimento extends ContaBanco{

    int t;
    
    public ContaInvestimento(int saldo, int t) {
        super(saldo);
        this.t = t;
    }

    public void calcularRM() {
        double r = saldo*(t/100);
        System.out.println("O rendimento mensal eh "+r);
        
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
