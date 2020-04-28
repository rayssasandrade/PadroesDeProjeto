package observer;

public class Noticia {

    private String textoNoticia;
    private int dia;
    private int mes;
    private String topico;

    public Noticia(String textoNoticia, int dia, int mes, String topico) {
        this.textoNoticia = textoNoticia;
        this.dia = dia;
        this.mes = mes;
        this.topico = topico;
    }

    public String getTextoNoticia() {
        return textoNoticia;
    }

    public void setTextoNoticia(String textoNoticia) {
        this.textoNoticia = textoNoticia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    @Override
    public String toString() {
        return "Noticia [" +
                "textoNoticia='" + textoNoticia + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", topico='" + topico + '\'' +
                ']';
    }
}
