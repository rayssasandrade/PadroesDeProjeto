package Command;

public class RoboElevarTemperatura implements RoboAction {
    private Microrganismo theMicrorganismo;

    public RoboElevarTemperatura(Microrganismo microrganismo) {
        this.theMicrorganismo = microrganismo;
    }

    @Override //Command
    public void execute() {
        theMicrorganismo.elevarTemperatura();
    }
}
