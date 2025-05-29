package view;

import java.util.List;
import java.util.Scanner;

import controller.ReservaController;
import model.Reserva;

public class ReservaView {
    
    Scanner scanner = new Scanner(System.in);
    ReservaController reservaController = new ReservaController();

    public void menuReserva() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Nova reserva");
        System.out.println("2 - Listar reservas");
        System.out.println("3 - Excluir reserva");
        System.out.println("0 - Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1: System.out.print("Qual o nome do responsável pela reserva?: ");
                    String nome = scanner.nextLine();

                    System.out.print("Qual a quantidade de pessoas na reserva?: ");
                    int qtdePessoas = scanner.nextInt();
   
                    reservaController.novaReserva(nome, qtdePessoas);               
                break;
            case 2:
                    List<Reserva> reservas = reservaController.listarReservas();
                    if (reservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada.");
                    } else {
                        for (Reserva r : reservas) {
                            System.out.println("Responsável: " + r.getNome());
                            System.out.println("Quantidade de pessoas: " + r.getQtdePessoas());
                            System.out.println("----------------------------");
                        }
                    }
                break;
            case 3: System.out.print("Qual o nome do responsável pela reserva?: ");
                    String nomeExcluir = scanner.nextLine();

                    reservaController.excluirReserva(nomeExcluir);
                break;
            case 0: System.out.println("Programa encerrando...");
                break;
            default:
                    System.out.println("Opção inválida.");
                break;
        }
    }
}
