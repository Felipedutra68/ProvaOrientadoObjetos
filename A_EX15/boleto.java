package A_EX15;

import EX5_EX12_Pagamento.*;
import EX4_EX7_Pagamento.*;
import java.util.Scanner;

/**
 *
 * @author ADM
 */


public class boleto extends pagar {

    public boleto() {
    }

    @Override
    public void pagamento(double v) {
        System.out.println("O pagamento de " + v + " foi efetuado");
    }

}

 class pix extends pagar {

    public pix() {
    }

    @Override
    public void pagamento(double v) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();
        v -= n1;
        System.out.println("O seu saldo eh de " + v);
    }

}
