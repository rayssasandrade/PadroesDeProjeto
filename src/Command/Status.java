package Command;

public class Status {
    private boolean vivo;

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Status(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Status{");
        sb.append("vivo=").append(vivo);
        sb.append('}');
        return sb.toString();
    }
}
