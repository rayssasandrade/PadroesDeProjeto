package Command;

public class Temperatura {
    private float temperatura;

    public Temperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temperatura{");
        sb.append("temperatura=").append(temperatura);
        sb.append('}');
        return sb.toString();
    }
}
