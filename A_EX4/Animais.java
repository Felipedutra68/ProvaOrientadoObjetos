package A_EX4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class Animais implements MetodoDeSons {
    
  
    public Animais() {
        
    }

   
    
    
    @Override
    public void emitirSom() {
        
            System.out.println("Muuuuuuu");
         }
       
        
        
    }

    class Gato implements MetodoDeSons{
     public Gato() {
        
    }

    @Override
    public void emitirSom() {
          System.out.println("Miaaaauuu");
    }

   
    
    
   
       
    
    }

class galinha implements MetodoDeSons{
 public galinha() {
        
    }




    @Override
    public void emitirSom() {
  System.out.println("Chocoooooo");
    }
    
    
    
    
    
}