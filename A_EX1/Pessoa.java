package A_EX1;

/**
 *
 * @author ADM
 */
public class Pessoa {
    
    String nome;
    int idade;
    int altura;        

    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

     public void apresentar() {
        System.out.println("Nome " +nome+"idade"+idade+"altura"+altura);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
            
    
    

}
