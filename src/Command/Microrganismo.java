package Command;

public class Microrganismo extends Actions {
    Temperatura temperatura;
    Status status;
    ProdutoQuimico produtoQuimico;
    //RECEIVER
    //Classe recebedora


    @Override
    public void elevarTemperatura() {
        System.out.println("Temperatura Elevada !");
    }

    @Override
    public void aplicarProdutoQuimico() {
        System.out.println("Produto Quimico Aplicado !");
    }

    @Override
    public String toString() {
        return "Microrganismo{" +
                "temperatura=" + temperatura +
                ", status=" + status +
                ", produtoQuimico=" + produtoQuimico +
                '}';
    }
}
