package SistemaDeControleRestaurante;

public class Gerente extends Pessoa {

    private boolean proprietario;
    private String cpf;

    public Gerente(String nome, String identidade, String endereço, int telefone, boolean proprietario, String cpf) {
        super(nome, identidade, endereço, telefone);
        this.proprietario = proprietario;
        this.cpf = cpf;
    }

    public void cadastrarGerente(){
    }

}
