package SistemaDeControleRestaurante;

public interface ProdutoInterface{
    PratoDeEntradaInterface criarEntrada(int quantidade, int preco, int codigo);
    PratoPrincipalInterface criarPrincipal(int quantidade, int preco, int codigo);
    SobremesaInterface criarSobremesa(int quantidade, int preco, int codigo);
    BebidaInterface criarBebida(int quantidade, int preco, int codigo);
}
