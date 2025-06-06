package A_EX15;

import EX5_EX12_Pagamento.*;
import EX4_EX7_Pagamento.*;

/**
 *
 * @author ADM
 */
public class Main {

    public static void main(String[] args) {
    
  

    boleto b = new boleto();

    b.pagamento(12.00);

    pix p = new pix();

    p.pagamento(15.00);

      }
    
}
