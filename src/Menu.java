import SistemaDeControleRestaurante.Produto;
import Command.*;
import GestaoProfessor.*;
import observer.Consumidor;
import observer.NoticiarioAssina;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha;
        do{
            System.out.println("--------------------------------------------------------");
            System.out.println("MENU");
            System.out.println("1- Decorator");
            System.out.println("2- Command");
            System.out.println("3- Observer");
            System.out.println("0- Sair");
            System.out.print("Opção: ");
            escolha = input.nextInt();
           switch (escolha){
               case 1:
                   System.out.println("-------------Decorator-------------");
                   ProfessorAb professor = new Professor();
                   professor.setNome("Jean");
                   System.out.println(professor.getNome() + ": " + professor.getFuncao() + " = "
                           + professor.getFg());

                   professor = new Coordernador(professor);
                   System.out.println(professor.getFuncao() + " = "
                           + professor.getFg());

                   professor = new GerenteDeEnsino(professor);
                   System.out.println(professor.getFuncao() + " = "
                           + professor.getFg());

                   ProfessorAb professor2 = new Professor();
                   professor2.setNome("Osman");

                   System.out.println(professor2.getNome() + ": " + professor2.getFuncao() + " = "
                           + professor2.getFg());

                   professor2 = new Diretor(professor2);
                   System.out.println(professor2.getFuncao() + " = "
                           + professor2.getFg());

                   break;
               case 2:
                   System.out.println("--------------Command---------------");
                   Microrganismo microrganismo = new Microrganismo();
                   RoboAction aplicarProdutoQuimico = new RoboAplicarProdutoQuimico(microrganismo);
                   RoboAction elevarTemperatura = new RoboElevarTemperatura(microrganismo);
                   Experimento meuExperimento = new Experimento();
                   System.out.println("Experimento criado!");
                   System.out.println("Armazenar aplicação de produto quimico: ");
                   meuExperimento.armazenar(aplicarProdutoQuimico);
                   System.out.println("Armazenar ação de elevar tempertaura: ");
                   meuExperimento.armazenar(elevarTemperatura);

                   System.out.println("Execultar ações");
                   meuExperimento.executar();

                   System.out.println("Clonar experimento: ");
                   Experimento novoExperimento = meuExperimento.clone();
                   System.out.println("Experimento clonado!");
                   break;
               case 3:
                   System.out.println("-------------Observer---------------");
                   NoticiarioAssina noticiario = new NoticiarioAssina();
                   new Consumidor("Kaiki", noticiario);
                   noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Topicos interessantes!");
                   new Consumidor("Rayssa", noticiario);
                   noticiario.notificaNoticia("Uma nova noticia", 2, 2, "Topico ruim");
                   break;
           }
        } while (escolha!=0);
        System.out.println("--------------------------------------------------------");
        System.out.println("FIM");
    }
}
