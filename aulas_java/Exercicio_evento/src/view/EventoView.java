package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import controller.EventoController;
import model.Evento;

public class EventoView {
    
    Scanner scanner = new Scanner(System.in);

    EventoController eventoController = new EventoController();


    public void menuEvento() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Novo evento");
        System.out.println("2 - Listar eventos");
        System.out.println("3 - Excluir evento");
        System.out.println("0 - Sair");
        int escolha = scanner.nextInt();
        scanner.nextLine();

    

    switch(escolha) {
        case 1:     System.out.print("Nome do evento: ");
                    String nome = scanner.nextLine();

                    System.out.print("Data (yyyy-MM-dd): ");
                    String dataStr = scanner.nextLine();
                    LocalDate data = LocalDate.parse(dataStr);

                    System.out.print("Local: ");
                    String local = scanner.nextLine();

                    System.out.print("Lotação máxima: ");
                    int lotacaoMaxima = scanner.nextInt();

                    System.out.print("Quantidade de ingressos vendidos: ");
                    int qtdeIngressos = scanner.nextInt();

                    System.out.print("Preço do ingresso: ");
                    double precoIngresso = scanner.nextDouble();
                    scanner.nextLine();

                    eventoController.novoEvento(nome,data, local, lotacaoMaxima, qtdeIngressos, precoIngresso);    
            break;
        case 2:
                    List<Evento> eventos = eventoController.listarEventos();
                        if (eventos.isEmpty()) {
                            System.out.println("Nenhum evento cadastrado.");
                        } else {
                            for (Evento e : eventos) {
                                System.out.println("Nome: " + e.getNome());
                                System.out.println("Data: " + e.getData());
                                System.out.println("Local: " + e.getLocal());
                                System.out.println("Lotação máxima: " + e.getLotacaoMaxima());
                                System.out.println("Ingressos vendidos: " + e.getQtdeIngressos());
                                System.out.println("Preço ingresso: " + e.getPrecoIngresso());
                                System.out.println("----------------------------");
                            }
                        }
            break;
        case 3:     System.out.println("Qual o nome do evento que você deseja excluir?: ");
                    String nomeExcluir = scanner.nextLine();

                    eventoController.excluirEvento(nomeExcluir);
            break;
        case 0:     System.out.println("Programa encerrando...");
            break;
        default:
                    System.out.println("Opção inválida.");
            break;
    }

    }

}
