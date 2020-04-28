package SistemaDeControleRestaurante;

public class Garçon extends Pessoa{

    private int matricula;

    public Garçon(String nome, String identidade, String endereço, int telefone, int matricula) {
        super(nome, identidade, endereço, telefone);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void encaminharSolicitaçãoDeCancelamento(){
    }

    public void encaminharSolicitaçãoDeFechamento(){
    }

    public void controlarOperaçãoDeMesa(){
    }

}
