package A_EX12;

/**
 *
 * @author ADM
 */
public class funcionariosHorista extends funcionrio {

    double salario;

    public funcionariosHorista(int salario) {
        this.salario = salario;
    }

    @Override
    public void salarioC() {
        double s = salario * 0.13;
        double s1 = s + salario;
        System.out.println("O salario atual eh " + s1);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}

class funcionariosAssalariados extends funcionrio {

    double salario;

    public funcionariosAssalariados(double salario) {
        this.salario = salario;
    }

    @Override
    public void salarioC() {
        double s = salario * 0.23;
        double s1 = s + salario;
        System.out.println("O salario atual eh " + s1);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
