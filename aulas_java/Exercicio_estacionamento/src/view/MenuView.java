package view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENU ESTACIONAMENTO ---");
        System.out.println("1 - Entrada de veículo");
        System.out.println("2 - Saída de veículo");
        System.out.println("3 - Gerar relatório");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        return scanner.nextInt();
    }

    public String solicitar(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }
}