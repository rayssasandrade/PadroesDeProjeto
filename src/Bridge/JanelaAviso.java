package Bridge;

public class JanelaAviso extends JanelaAbstrata {
    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar() {
        desenharJanela("Janela Aviso");
        desenharBotao("OK");
    }
}
