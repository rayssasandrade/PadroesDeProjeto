package SistemaDeControleRestaurante;
import java.util.List;

public class Cardapio {
    List<Produto> produtos;
    public static Cardapio instancia;

    private Cardapio() {
    }

    public static Cardapio getInstancia() {
        if (instancia == null)
            instancia = new Cardapio();
        return instancia;
    }

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public String gerarRelatorio(){
        return new String();
    }
}
