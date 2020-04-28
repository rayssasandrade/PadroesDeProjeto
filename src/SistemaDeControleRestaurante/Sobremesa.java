package SistemaDeControleRestaurante;

public class Sobremesa implements SobremesaInterface{
    private int quantidade;
    private int preco;
    private int codigo;

    public Sobremesa(int quantidade, int preco, int codigo) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void exibirInfoSobremesa() {
        System.out.println("Categoria: Sobremesa");
        System.out.println("Código: "+codigo);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Preço: "+preco);
    }
}
