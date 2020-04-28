package GestaoProfessor;

public abstract class ProfessorAb {
    String funcao;
    String matricula;
    String nome;
    double fg;

    public String getFuncao() {
        return funcao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFg() {
        return fg;
    }
}
