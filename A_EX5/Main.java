package A_EX5;

import EX4_EX3_Funcionarios.*;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do gerente");
        String nomeG = sc.nextLine();
        System.out.println("Digite o salario do gerente");
        double SalarioG = sc.nextDouble();

        Bonus gerente2 = new gerente(nomeG, SalarioG);

        sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor");
        String nomeV = sc2.nextLine();
        System.out.println("Digite o salario do vendedor");
        double SalarioV = sc2.nextDouble();

        Bonus vendedor2 = new gerente(nomeV, SalarioV);

        sc.nextLine();

        System.out.println("Bonus do gerente " + gerente2.CalBonus());
        System.out.println("Bonus do vendedor " + vendedor2.CalBonus());

    }

}
