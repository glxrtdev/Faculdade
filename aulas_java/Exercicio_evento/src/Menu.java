import java.util.Scanner;

import view.EventoView;
import view.ReservaView;

public class Menu {
    
    Scanner scanner = new Scanner(System.in);

    EventoView eventoView = new EventoView();
    ReservaView reservaView = new ReservaView();

    public void menu() {

        int opcao = -1;

        while(opcao != 0) {
        System.out.println("\nBem-vindo(a). Escolha uma opção: ");
        System.out.println("1 - Gerenciar eventos");
        System.out.println("2 - Gerenciar reservas");
        System.out.println("0 - Sair");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1: 
                eventoView.menuEvento();
                break;
            case 2:
                reservaView.menuReserva();
                break;
            case 0:
                System.out.println("Programa encerrando...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
    }
}
