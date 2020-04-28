package BridgeII;

public class ReciboEntrega implements Artigo{
    private GeradorArquivo geradorArquivo;

    public ReciboEntrega(GeradorArquivo geradorArquivo){
        this.geradorArquivo = geradorArquivo;
    }

    @Override
    public void gerarArquivo() {
        this.geradorArquivo.gera("Arquivo.txt");
    }
}
