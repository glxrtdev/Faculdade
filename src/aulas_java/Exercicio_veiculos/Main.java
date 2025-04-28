package src.aulas_java.Exercicio_veiculos;

import src.aulas_java.Exercicio_veiculos.Funcionalidades.*;
import java.util.Scanner;

public class Main {
        
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual opção deseja?: ");
        System.out.println("1 - Cadastrar novo veículo");
        System.out.println("2 - Listar todos os veículos");
        System.out.println("3 - Executar ação com um veículo");
        System.out.println("0 - Sair");
        int opcao = scanner.nextInt();

      
        if (opcao == 1) {
            CadastroVeiculos.cadastrarVeiculo();
        } else if (opcao == 3) {
            AcoesVeiculos.acoesVeiculos();
        } else if (opcao == 0) {
            System.out.println("Finalizando o programa!");
        }
       
            
    }

}
