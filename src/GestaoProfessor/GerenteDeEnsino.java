package GestaoProfessor;

public class GerenteDeEnsino extends ProfessorDecorator{
    public GerenteDeEnsino(ProfessorAb professor){
        super(professor);
        funcao = "Gerente De Ensino";
        fg = 2635.83;
    }
}
