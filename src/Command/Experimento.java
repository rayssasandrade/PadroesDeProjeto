package Command;

import java.util.ArrayList;
import java.util.List;

public class Experimento extends Actions {
    //CLASSE INVOCADORA

    //Lista com a sequencia de acoes
    private List<RoboAction> history = new ArrayList<RoboAction>();

    public void armazenar(RoboAction commando) {
        //operacao adicionaracao
        this.history.add(commando);
    }

    public void executar(){
        for (int i = 0; i < history.size(); i++) {
            history.get(i).execute();
        }
    }

    //Clone
    public Experimento clone(){
        Experimento novo = new Experimento();
        novo.history= history;
        return novo;
    }

    @Override
    public String toString() {
        String experimento = new String("");
        for (int i = 0; i < history.size(); i++) {
            experimento = experimento + history.get(i).toString();
        }
        return experimento;
    }
}
