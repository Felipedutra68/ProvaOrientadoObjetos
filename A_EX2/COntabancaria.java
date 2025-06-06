package A_EX2;

/**
 *
 * @author ADM
 */
public class COntabancaria {
String NumeroConta;
double saldo;    
String titular;

  
void depositar (double valor){
    saldo += valor;
    System.out.println("Deposito de R$"+valor+" realizado com sucesso.\nNovo saldo: R$"+saldo);
    
}

 
}