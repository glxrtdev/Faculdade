package src.aulas_java.Exercicio_veiculos.Funcionalidades;

import src.aulas_java.Exercicio_veiculos.*;
import java.util.Scanner;

public class CadastroVeiculos {

    public static void cadastrarVeiculo(){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha o tipo do veículo que você deseja cadastrar: ");
    System.out.println("1 - Veículo Terrestre");
    System.out.println("2 - Veículo Aéreo");
    System.out.println("3 - Veículo Aquático");
    int tipoVeiculoCadastro = scanner.nextInt();
    scanner.nextLine();

    if (tipoVeiculoCadastro < 1 || tipoVeiculoCadastro > 3) {
        System.out.println("Opção inválida!");
        return;
    }

     Veiculos veiculoCadastro = null;

    // Declarando variaveis que se repetem
    String modelo = "";
    int ano = 0;
    String cor = "";
    boolean ligado = false;
    int numeroRodas = 0;

    System.out.println("Cadastro de Veículo");

    switch (tipoVeiculoCadastro) {
        case 1: System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Ônibus");
                System.out.println("4 - Bicicleta");
                int veiculoTerrestreCadastro = scanner.nextInt();
                scanner.nextLine();

                switch (veiculoTerrestreCadastro) {
                    case 1:
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();

                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();

                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();

                            System.out.print("Digite o número de portas: ");
                            int numeroPortas = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Digite o tipo de transmissão (Manual/Automática): ");
                            String tipoTransmissao = scanner.nextLine();

                            System.out.print("Digite a capacidade do porta-malas (em litros): ");
                            float capacidadePortaMalas = scanner.nextFloat();

                            System.out.print("Digite o número de rodas: ");
                            numeroRodas = scanner.nextInt();

                            // Criando o objeto Carro
                            Carro carroNovo = new Carro(modelo, ano, cor, ligado, numeroPortas, tipoTransmissao, capacidadePortaMalas, numeroRodas);
                            veiculoCadastro = carroNovo;
                        break;

                    case 2:
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();

                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine(); 

                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();

                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();

                            System.out.print("Digite a cilindrada do veículo: ");
                            int cilindradas = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Digite o tipo de combustível: "); 
                            String tipoCombustivel = scanner.nextLine();

                            System.out.print("Digite o tipo de freio: ");
                            String tipoFreio = scanner.nextLine();

                            System.out.print("Digite o número de rodas: ");
                            numeroRodas = scanner.nextInt();

                            // Criando o objeto Moto
                            Moto motoNova = new Moto(modelo, ano, cor, ligado, cilindradas, tipoCombustivel, tipoFreio, numeroRodas);
                            veiculoCadastro = motoNova;
                        break;
                    
                    case 3: 
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();
                    
                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();
                    
                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();
                    
                            System.out.print("Digite a capacidade de passageiros: ");
                            int capacidadePassageiros = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite o número de portas de acesso: ");
                            int portasAcesso = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite o número de paradas do veículo: ");
                            int numeroParadas = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite o número de rodas: ");
                            numeroRodas = scanner.nextInt();

                            // Criando o objeto Onibus
                            Onibus onibusNovo = new Onibus(modelo, ano, cor, ligado, capacidadePassageiros, portasAcesso, numeroParadas, numeroRodas);
                            veiculoCadastro = onibusNovo;
                         break;

                    case 4: 
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();
                    
                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();
                    
                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();
                    
                            System.out.print("Digite o número de marchas: ");
                            int numeroMarchas = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite o tipo de freio: ");
                            tipoFreio = scanner.nextLine();
                    
                            System.out.print("Digite o estilo do quadro: ");
                            String estiloQuadro = scanner.nextLine();
                    
                            System.out.print("Digite o número de rodas: ");
                            numeroRodas = scanner.nextInt();

                            // Criando o objeto Bicicleta
                            Bicicleta bicicletaNova = new Bicicleta(modelo, ano, cor, ligado, numeroMarchas, tipoFreio, estiloQuadro, numeroRodas);
                            veiculoCadastro = bicicletaNova;
                        break;

                    default:
                        break;
                }
            break;

        case 2: System.out.println("1 - Avião");
                System.out.println("2 - Helicóptero");
                int veiculoAereoCadastro = scanner.nextInt();
                scanner.nextLine();

                switch (veiculoAereoCadastro) {
                    case 1:
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();
                    
                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();
                    
                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();
                    
                            System.out.print("Digite o número de motores: ");
                            int numeroMotores = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Digite a envergadura da asa (em metros): ");
                            double envergaduraAsa = scanner.nextDouble();
                            
                            System.out.print("Digite o tipo de combustível do avião: ");
                            String tipoCombustivelAviao = scanner.nextLine();

                            // Criando o objeto Aviao
                            Aviao aviaoNovo = new Aviao(modelo, ano, cor, ligado, numeroMotores, envergaduraAsa, tipoCombustivelAviao);
                            veiculoCadastro = aviaoNovo;
                        break;
                    case 2:
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();
                    
                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();
                    
                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();
                    
                            System.out.print("Digite o número de motores: ");
                            numeroMotores = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite o número de hélices: ");
                            int numeroHelices = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a capacidade de carga (em kg): ");
                            float capacidadeCarga = scanner.nextFloat();

                            // Criando o objeto Helicoptero
                            Helicoptero helicopteroNovo = new Helicoptero(modelo, ano, cor, ligado, numeroMotores, numeroHelices, capacidadeCarga);
                            veiculoCadastro = helicopteroNovo;
                        break;
                
                    default:
                        break;
                        
                }
            break;
        
        case 3: System.out.println("1 - Submarino");
                int veiculoAquaticoCadastro = scanner.nextInt();
                scanner.nextLine();

                switch (veiculoAquaticoCadastro) {
                    case 1:
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = scanner.nextLine();
                    
                            System.out.print("Digite o ano do veículo: ");
                            ano = scanner.nextInt();
                            scanner.nextLine();
                    
                            System.out.print("Digite a cor do veículo: ");
                            cor = scanner.nextLine();
                    
                            System.out.print("O veículo está ligado? (true/false): ");
                            ligado = scanner.nextBoolean();
                    
                            System.out.print("Digite o comprimento do veículo (em metros): ");
                            double comprimento = scanner.nextDouble();
                    
                            System.out.print("Digite a profundidade máxima (em metros): ");
                            float profundidadeMaxima = scanner.nextFloat();

                            // Criando o objeto Submarino
                            Submarino submarinoNovo = new Submarino(modelo, ano, cor, ligado, comprimento, profundidadeMaxima);
                            veiculoCadastro = submarinoNovo;
                        break;
                
                    default:
                        break;
                }
            break;

        default:
            break;
    }

    System.out.println("Veículo cadastrado com sucesso!");
    System.out.println("Modelo: " + veiculoCadastro.getModelo());
    System.out.println("Ano: " + veiculoCadastro.getAno());
    System.out.println("Cor: " + veiculoCadastro.getCor());
    System.out.println("Ligado: " + veiculoCadastro.isLigado());

    if (veiculoCadastro instanceof Carro){
        Carro carro = (Carro) veiculoCadastro; //cast
        System.out.println("Número de portas: " + carro.getNumeroPortas());
        System.out.println("Tipo de Transmissão: " + carro.getTipoTransmissao());
        System.out.println("Capacidade do porta-malas: " + carro.getCapacidadePortaMalas() + " litros");
        System.out.println("Número de rodas: " + carro.getNumeroRodas());
    } 
    else if (veiculoCadastro instanceof Moto) {
        Moto moto = (Moto) veiculoCadastro;  //cast
        System.out.println("Cilindrada: " + moto.getCilindradas());
        System.out.println("Tipo de Combustível: " + moto.getTipoCombustivel());
        System.out.println("Tipo de Freio: " + moto.getTipoFreio());
        System.out.println("Número de rodas: " + moto.getNumeroRodas());
    } 
    else if (veiculoCadastro instanceof Onibus) {
        Onibus onibus = (Onibus) veiculoCadastro;  //cast
        System.out.println("Capacidade de passageiros: " + onibus.getCapacidadePassageiros());
        System.out.println("Número de portas de acesso: " + onibus.getPortasAcesso());
        System.out.println("Número de paradas: " + onibus.getNumeroParadas());
        System.out.println("Número de rodas: " + onibus.getNumeroRodas());
    } 
    else if (veiculoCadastro instanceof Bicicleta) {
        Bicicleta bicicleta = (Bicicleta) veiculoCadastro;  //cast
        System.out.println("Número de marchas: " + bicicleta.getNumeroMarchas());
        System.out.println("Tipo de Freio: " + bicicleta.getTipoFreio());
        System.out.println("Estilo do quadro: " + bicicleta.getEstiloQuadro());
        System.out.println("Número de rodas: " + bicicleta.getNumeroRodas());
    } 
    else if (veiculoCadastro instanceof Aviao) {
        Aviao aviao = (Aviao) veiculoCadastro;  //cast
        System.out.println("Número de motores: " + aviao.getNumeroMotores());
        System.out.println("Envergadura da asa: " + aviao.getEnvergaduraAsa() + " metros");
        System.out.println("Tipo de Combustível do avião: " + aviao.getTipoCombustivelAviao());
    } 
    else if (veiculoCadastro instanceof Helicoptero) {
        Helicoptero helicoptero = (Helicoptero) veiculoCadastro;  //cast
        System.out.println("Número de motores: " + helicoptero.getNumeroMotores());
        System.out.println("Número de hélices: " + helicoptero.getNumeroHelices());
        System.out.println("Capacidade de carga: " + helicoptero.getCapacidadeCarga() + " kg");
    } 
    else if (veiculoCadastro instanceof Submarino) {
        Submarino submarino = (Submarino) veiculoCadastro;  //cast
        System.out.println("Comprimento: " + submarino.getComprimento() + " metros");
        System.out.println("Profundidade máxima: " + submarino.getProfundidadeMaxima() + " metros");
    }


}

}