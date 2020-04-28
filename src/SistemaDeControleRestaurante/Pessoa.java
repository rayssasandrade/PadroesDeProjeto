package SistemaDeControleRestaurante;

public class Pessoa {
    private String nome;
    private String identidade;
    private String endereço;
    private int telefone;

    public Pessoa(String nome, String identidade, String endereço, int telefone) {
        this.nome = nome;
        this.identidade = identidade;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
