package GestaoProfessor;

public class Main {
    public static void main(String[] args) {
        ProfessorAb professor = new Professor();
        professor.setNome("Jean");
        System.out.println(professor.nome + ": " + professor.getFuncao() + " = "
                + professor.getFg());

        professor = new Coordernador(professor);
        System.out.println(professor.getFuncao() + " = "
                + professor.getFg());

        professor = new GerenteDeEnsino(professor);
        System.out.println(professor.getFuncao() + " = "
                + professor.getFg());

        ProfessorAb professor2 = new Professor();
        professor2.setNome("Osman");

        System.out.println(professor2.nome + ": " + professor2.getFuncao() + " = "
                + professor2.getFg());

        professor2 = new Diretor(professor2);
        System.out.println(professor2.getFuncao() + " = "
                + professor2.getFg());
    }
}
