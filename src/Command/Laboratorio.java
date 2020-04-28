package Command;

public class Laboratorio {
    public static void main(String[] args) {

        // Checa o número de argumentos
//        if (args.length != 1) {
//            System.err.println("Ação necessaria!");
//            System.exit(-1);
//        }

        //Processo de testes biologicos
        Microrganismo microrganismo = new Microrganismo();
        RoboAction aplicarProdutoQuimico = new RoboAplicarProdutoQuimico(microrganismo);
        RoboAction elevarTemperatura = new RoboElevarTemperatura(microrganismo);

        Experimento meuExperimento = new Experimento();
        meuExperimento.armazenar(aplicarProdutoQuimico);
        meuExperimento.armazenar(elevarTemperatura);
        meuExperimento.executar();
        Experimento novoExperimento = meuExperimento.clone();

//        switch(args[0]) {
//            case "elevar":
//                meuExperimento.armazenarExecutar(aplicarProdutoQuimico);
//                break;
//            case "aplicar":
//                meuExperimento.armazenarExecutar(elevarTemperatura);
//                break;
//            default:
//                System.err.println("Acao necessaria!");
//                System.exit(-1);
//        }
    }
}
