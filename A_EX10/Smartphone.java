package A_EX10;

/**
 *
 * @author ADM
 */
public class Smartphone extends eletronico{
    
    public Smartphone(String nome) {
        super(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     //A heranca he utilizada para atribuir o atributo nome a classe Smartphone para que a informacao seja armazenada 

}

class tablet extends eletronico{
    
    public tablet(String nome) {
        super(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
         //A heranca he utilizada para atribuir o atributo nome a classe tablet para que a informacao seja armazenada 

    
    
}