package A_EX5;

import EX4_EX3_Funcionarios.*;

/**
 *
 * @author ADM
 */
public abstract class Bonus {

    protected String nome;
    
        protected double salario;

    public Bonus(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
        
        


    public abstract double CalBonus();

}
