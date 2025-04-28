package src.aulas_java.Exercicio_veiculos.Funcionalidades;

import src.aulas_java.Exercicio_veiculos.*;

import java.util.Scanner;

public class AcoesVeiculos {
 
    public static void acoesVeiculos(){

        Scanner scanner = new Scanner(System.in);

        // Instanciando veículos
        Carro carro1 = new Carro("Corsa", 2008, "Preto", false, 2, "Manual", 200, 4);
        Carro carro2 = new Carro("Celta", 2004, "Branco", false, 2, "Manual", 235, 4);

        Moto moto1 = new Moto("CG", 2002, "Cinza", false, 150, "Gasolina", "Disco", 2);
        Moto moto2 = new Moto("XJ6", 2014, "Dourado", false, 600, "Gasolina", "Disco", 2);

        Onibus onibus1 = new Onibus("Marcopolo", 2010, "Azul", false, 54, 3, 12, 8);
        Onibus onibus2 = new Onibus("Mercedes", 2018, "Verde", false, 45, 3, 15, 8);

        Bicicleta bicicleta1 = new Bicicleta("Caloi", 2021, "Vermelha", false, 18, "Disco", "Urbana", 2);
        Bicicleta bicicleta2 = new Bicicleta("Sense", 2023, "Preta", false, 24, "Disco", "Montanha", 2);

        Aviao aviao1 = new Aviao("Boing 747", 2001, "Branco", false, 4, 64.4, "AVGAS");
        Aviao aviao2 = new Aviao("AirBus A380", 2002, "Azul", false, 4, 79.8, "AVGAS");

        Helicoptero helicoptero1 = new Helicoptero("BK 117 D-2", 2017, "Preto", false, 2, 3, 1781);
        Helicoptero helicoptero2 = new Helicoptero("BK 117 D-3", 2025, "Prata", false, 2, 3, 2000);

        Submarino submarino1 = new Submarino("K63n", 2005, "Preto", false, 71.4, 11000);
        Submarino submarino2 = new Submarino("K25n", 2025, "Preto", false, 71.4, 7000);

        System.out.println("Escolha o tipo do veículo:");
        System.out.println("1 - Terrestre");
        System.out.println("2 - Aéreo");
        System.out.println("3 - Aquático");
        int tipoVeiculo = scanner.nextInt();

        // validação fora do switch
        if (tipoVeiculo < 1 || tipoVeiculo > 3) {
            System.out.println("Opção inválida!");
        }

        int escolhaVeiculoTerrestre = 0;
        int escolhaVeiculoAereo = 0;
        int escolhaVeiculoAquatico = 0;

        switch (tipoVeiculo) {
            case 1:
                System.out.println("Escolha um veículo terrestre:");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                System.out.println("3 - Ônibus");
                System.out.println("4 - Bicicleta");
                escolhaVeiculoTerrestre = scanner.nextInt();
                break;

            case 2:
                System.out.println("Escolha um veículo aéreo: ");
                System.out.println("1 - Avião");
                System.out.println("2 - Helicóptero");
                escolhaVeiculoAereo = scanner.nextInt();
                break;

            case 3:
                System.out.println("Escolha um veículo aquático:");
                System.out.println("1 - Submarino");
                escolhaVeiculoAquatico = scanner.nextInt();
                break;
        }

        Veiculo veiculoEscolhido = null;

        switch (tipoVeiculo) {
            case 1:
                switch (escolhaVeiculoTerrestre) {
                    case 1:
                        System.out.println("Escolha um modelo de carro: ");
                        System.out.println("1 - " + carro1.getModelo());
                        System.out.println("2 - " + carro2.getModelo());
                        int carroEscolhido = scanner.nextInt();
                        veiculoEscolhido = (carroEscolhido == 1) ? carro1 : carro2;
                        break;
                    case 2:
                        System.out.println("Escolha um modelo de moto: ");
                        System.out.println("1 - " + moto1.getModelo());
                        System.out.println("2 - " + moto2.getModelo());
                        int motoEscolhida = scanner.nextInt();
                        veiculoEscolhido = (motoEscolhida == 1) ? moto1 : moto2;
                        break;
                    case 3:
                        System.out.println("Escolha um modelo de ônibus: ");
                        System.out.println("1 - " + onibus1.getModelo());
                        System.out.println("2 - " + onibus2.getModelo());
                        int onibusEscolhido = scanner.nextInt();
                        veiculoEscolhido = (onibusEscolhido == 1) ? onibus1 : onibus2;
                        break;
                    case 4:
                        System.out.println("Escolha o modelo da bicicleta: ");
                        System.out.println("1 - " + bicicleta1.getModelo());
                        System.out.println("2 - " + bicicleta2.getModelo());
                        int bicicletaEscolhida = scanner.nextInt();
                        veiculoEscolhido = (bicicletaEscolhida == 1) ? bicicleta1 : bicicleta2;
                        break;
                    default:
                        System.out.println("Opção escolhida inválida.");
                }
                break;

            case 2:
                switch (escolhaVeiculoAereo) {
                    case 1:
                        System.out.println("Escolha um modelo de avião: ");
                        System.out.println("1 - " + aviao1.getModelo());
                        System.out.println("2 - " + aviao2.getModelo());
                        int aviaoEscolhido = scanner.nextInt();
                        veiculoEscolhido = (aviaoEscolhido == 1) ? aviao1 : aviao2;
                        break;
                    case 2:
                        System.out.println("Escolha um modelo de helicóptero: ");
                        System.out.println("1 - " + helicoptero1.getModelo());
                        System.out.println("2 - " + helicoptero2.getModelo());
                        int helicopteroEscolhido = scanner.nextInt();
                        veiculoEscolhido = (helicopteroEscolhido == 1) ? helicoptero1 : helicoptero2;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;

            case 3:
                switch (escolhaVeiculoAquatico) {
                    case 1:
                        System.out.println("Escolha um modelo de submarino: ");
                        System.out.println("1 - " + submarino1.getModelo());
                        System.out.println("2 - " + submarino2.getModelo());
                        int submarinoEscolhido = scanner.nextInt();
                        veiculoEscolhido = (submarinoEscolhido == 1) ? submarino1 : submarino2;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
                break;
        }

        System.out.println("\nVocê escolheu o veículo abaixo:");
        System.out.println(veiculoEscolhido);

        // Ações gerais
        System.out.println("\nEscolha uma ação:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Virar");

        // Ações específicas por tipo
        if (veiculoEscolhido instanceof Carro) {
            System.out.println("6 - Ligar Farol Neblina");
            System.out.println("7 - Abrir Teto Solar");
        } else if (veiculoEscolhido instanceof Moto) {
            System.out.println("6 - Ativar Modo Esportivo");
            System.out.println("7 - Ligar Partida Elétrica");
        } else if (veiculoEscolhido instanceof Onibus) {
            System.out.println("6 - Abrir Porta Dianteira");
            System.out.println("7 - Anunciar Parada");
        } else if (veiculoEscolhido instanceof Bicicleta) {
            System.out.println("6 - Pedalar");
            System.out.println("7 - Parar");
        } else if (veiculoEscolhido instanceof Aviao) {
            System.out.println("6 - Decolar");
            System.out.println("7 - Pousar");
        } else if (veiculoEscolhido instanceof Helicoptero) {
            System.out.println("6 - Pairar");
            System.out.println("7 - Resgatar Pessoas");
        } else if (veiculoEscolhido instanceof Submarino) {
            System.out.println("6 - Mergulhar");
            System.out.println("7 - Emergir");
        }

        int opcaoAcao = scanner.nextInt();

        switch (opcaoAcao) {
            case 1:
                veiculoEscolhido.ligar();
                break;
            case 2:
                veiculoEscolhido.desligar();
                break;
            case 3:
                veiculoEscolhido.acelerar();
                break;
            case 4:
                veiculoEscolhido.frear();
                break;
            case 5:
                veiculoEscolhido.virar();
                break;
            case 6:
                if (veiculoEscolhido instanceof Carro) {
                    ((Carro) veiculoEscolhido).ligarFarolNeblina();
                } else if (veiculoEscolhido instanceof Moto) {
                    ((Moto) veiculoEscolhido).ativarModoEsportivo();
                } else if (veiculoEscolhido instanceof Onibus) {
                    ((Onibus) veiculoEscolhido).abrirPortaDianteira();
                } else if (veiculoEscolhido instanceof Bicicleta) {
                    ((Bicicleta) veiculoEscolhido).pedalar();
                } else if (veiculoEscolhido instanceof Aviao) {
                    ((Aviao) veiculoEscolhido).decolar();
                } else if (veiculoEscolhido instanceof Helicoptero) {
                    ((Helicoptero) veiculoEscolhido).pairar();
                } else if (veiculoEscolhido instanceof Submarino) {
                    ((Submarino) veiculoEscolhido).mergulhar();
                }
                break;
            case 7:
                if (veiculoEscolhido instanceof Carro) {
                    ((Carro) veiculoEscolhido).abrirTetoSolar();
                } else if (veiculoEscolhido instanceof Moto) {
                    ((Moto) veiculoEscolhido).ligarPartidaEletrica();
                } else if (veiculoEscolhido instanceof Onibus) {
                    ((Onibus) veiculoEscolhido).anunciarParadaProxima();
                } else if (veiculoEscolhido instanceof Bicicleta) {
                    ((Bicicleta) veiculoEscolhido).parar();
                } else if (veiculoEscolhido instanceof Aviao) {
                    ((Aviao) veiculoEscolhido).pousar();
                } else if (veiculoEscolhido instanceof Helicoptero) {
                    ((Helicoptero) veiculoEscolhido).resgatarPessoas();
                } else if (veiculoEscolhido instanceof Submarino) {
                    ((Submarino) veiculoEscolhido).emergir();
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
