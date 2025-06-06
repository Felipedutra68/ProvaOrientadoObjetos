package A_EX27;

/**
 *
 * @author ADM
 */
public class aluno extends pessoa{

    public aluno(int matricula) {
        super(matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
//A heranca eh util pois adiciona um atributo na classe aluno ja existente na classe pessoa  