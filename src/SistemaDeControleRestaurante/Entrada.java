package SistemaDeControleRestaurante;

public class Entrada implements PratoDeEntradaInterface{
    private int quantidade;
    private int preco;
    private int codigo;

    public Entrada(int quantidade, int preco, int codigo) {
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

    public void exibirInfoPopular() {
        System.out.println("Categoria: Entrada");
        System.out.println("Código: "+codigo);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Preço: "+preco);
    }
}
