package Command;

public class ProdutoQuimico {
    private String produto;

    public ProdutoQuimico(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProdutoQuimico{");
        sb.append("produto='").append(produto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
