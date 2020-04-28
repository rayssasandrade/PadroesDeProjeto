package GestaoProfessor;

public class Diretor extends ProfessorDecorator {
    public Diretor(ProfessorAb professor){
        super(professor);
        funcao = "Diretor";
        fg = 16517.34;
    }
}
