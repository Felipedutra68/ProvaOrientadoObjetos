package A_EX8;

/**
 *
 * @author ADM
 */
public class funcionario extends ficha {

    public funcionario(String nome, int idade) {
        super(nome, idade);
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

    
    
}
