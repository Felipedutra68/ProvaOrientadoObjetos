package A_EX6;

/**
 *
 * @author ADM
 */
public class livro {
    
    String titulo;
    String autor;
    boolean disponivel;

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro " + titulo + " emprestado com sucesso");
        } else {
            System.out.println("Livro " + titulo + " nao enta disponivel para emprestimo");

        }

    }

    void devolver() {
        if (!disponivel) {
            disponivel = true;

            System.out.println("Livro " + titulo + " devolvido com sucesso");
        } else {

            System.out.println("Livro "+titulo+" ja esta disponivel");
            
            
            
        }

    }

    
}
