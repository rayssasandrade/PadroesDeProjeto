package SistemaDeControleRestaurante;

public class Produto implements ProdutoInterface{

    @Override
    public PratoDeEntradaInterface criarEntrada(int quantidade, int preco, int codigo) {
        return new Entrada(quantidade, codigo, preco);
    }

    @Override
    public PratoPrincipalInterface criarPrincipal(int quantidade, int preco, int codigo) {
        return new Principal(quantidade, codigo, preco);
    }

    @Override
    public SobremesaInterface criarSobremesa(int quantidade, int preco, int codigo) {
        return new Sobremesa(quantidade, preco, codigo);
    }

    @Override
    public BebidaInterface criarBebida(int quantidade, int preco, int codigo) {
        return new Bebida(quantidade, preco, codigo);
    }
}
