package A_EX6;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Main {
    
     public static void main(String[] args) {
    
         Scanner teclado = new Scanner(System.in);
         
         Scanner teclado2 = new Scanner(System.in);

         
         livro livro = new livro(); 
         
         System.out.println("Digite o titulo do livro: ");
         livro.titulo =  teclado.nextLine();
         
         System.out.println("Digite o autor do livro: ");
         livro.autor =  teclado.nextLine();

          livro.disponivel = true;
          
          
          System.out.println("\nDeseja emprestar o livro? (s/n)");
          
          teclado.nextLine();
          String opcao = teclado.nextLine();
          if (opcao.equalsIgnoreCase("s")){
          opcao = teclado.nextLine();
          }
          
          System.out.println("\nDeseja devolver o livro?  (s/n)");
          livro.devolver();
          
          if (opcao.equalsIgnoreCase("s")){
          
        livro.emprestar();
              
          }
          
          
          teclado.close();
          
          
          
               
          
     }
}
