package Command;

public class RoboAplicarProdutoQuimico implements RoboAction {
    private Microrganismo theMicrorganismo;

    public RoboAplicarProdutoQuimico(Microrganismo microrganismo) {
        this.theMicrorganismo = microrganismo;
    }

    @Override //Command
    public void execute() {
        theMicrorganismo.aplicarProdutoQuimico();
    }
}
