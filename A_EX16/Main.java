package A_EX16;

import EX5_EX9_Eletronicos.*;

/**
 *
 * @author ADM
 */
public class Main {

     public static void main(String[] args) {

        televisao t = new televisao("Bohemian Rhaps", "dfs", true, 12,2);

        geladeira g = new geladeira("Meu malvado favorito", "a", true, 32);

      
        System.out.println("Marca: "+t.marca+ " modelo "+t.modelo+ " ligado " +t.ligar+ " canal "+t.canal+ " volume " +t.volume);
        System.out.println("Marca: "+g.marca+ " modelo "+g.modelo+ " ligado "+g.ligar+ " temperatura "+g.temperatura );
        
    }
    
}
