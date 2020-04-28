package observer;

public class Consumidor implements ConsomeNoticia{
    private NoticiarioAssina noticiario;
    private String nome;

    public Consumidor(String nome, NoticiarioAssina noticiario) {
        this.noticiario = noticiario;
        this.nome = nome;
        this.noticiario.inscrever(this);
    }

    public void update() {
        System.out.println(nome + " noticia recebida: " + noticiario.getNoticia().toString());
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
        System.out.println();
    }
}
