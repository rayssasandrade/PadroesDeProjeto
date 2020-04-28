package GestaoProfessor;

public abstract class ProfessorDecorator extends Professor {
    ProfessorAb professor;

    public ProfessorDecorator(ProfessorAb professor) {
        this.professor = professor;
    }

    @Override
    public String getFuncao() {
        return professor.getFuncao()  + " + " + funcao;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public double getFg() {
        return professor.getFg() + fg;
    }
}
