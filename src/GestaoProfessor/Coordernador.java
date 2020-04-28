package GestaoProfessor;

public class Coordernador extends ProfessorDecorator {
    public Coordernador(ProfessorAb professor){
        super(professor);
        funcao = "Coordenador";
        fg = 1694.94;
    }
}
