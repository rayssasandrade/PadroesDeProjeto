package BridgeII;

public class TesteRecibo {
    public static void main(String[] args) {
        GeradorArquivo geradorArquivoTXT = new GeradorDeArquivoTXT();
        ReciboEntrega recibo = new ReciboEntrega(geradorArquivoTXT);
        recibo.gerarArquivo();
    }
}
