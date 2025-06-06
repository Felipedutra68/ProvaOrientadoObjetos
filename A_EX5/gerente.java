package A_EX5;

import EX4_EX3_Funcionarios.*;

/**
 *
 * @author ADM
 */
public class gerente extends Bonus {

    public gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double CalBonus() {
        return salario * 0.15;

    }

}

class vendedor extends Bonus {

    public vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double CalBonus() {
        return salario * 10.0;
    }

}




