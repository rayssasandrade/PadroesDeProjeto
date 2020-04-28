package observer;

public class Teste {

    public static void main(String[] args) {

        NoticiarioAssina noticiario = new NoticiarioAssina();
        new Consumidor("Kaiki", noticiario);
        noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Topicos interessantes!");
        new Consumidor("Rayssa", noticiario);
        noticiario.notificaNoticia("Uma nova noticia", 2, 2, "Topico ruim");
    }
}
