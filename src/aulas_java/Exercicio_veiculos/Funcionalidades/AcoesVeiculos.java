package src.aulas_java.Exercicio_veiculos.Funcionalidades;

import src.aulas_java.Exercicio_veiculos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcoesVeiculos {
 
    public static List<Veiculos> listaVeiculos = new ArrayList<>();

    public static Carro carro1, carro2;
    public static Moto moto1, moto2;
    public static Onibus onibus1, onibus2;
    public static Bicicleta bicicleta1, bicicleta2;
    public static Aviao aviao1, aviao2;
    public static Helicoptero helicoptero1, helicoptero2;
    public static Barco barco1, barco2;
    public static Submarino submarino1, submarino2;

    public static void acoesVeiculos(){

        Scanner scanner = new Scanner(System.in);

        InstanciadorVeiculos.adicionarVeiculosPadrao(listaVeiculos);

            carro1 = (Carro) listaVeiculos.get(0);
            carro2 = (Carro) listaVeiculos.get(1);
            moto1 = (Moto) listaVeiculos.get(2);
            moto2 = (Moto) listaVeiculos.get(3);
            onibus1 = (Onibus) listaVeiculos.get(4);
            onibus2 = (Onibus) listaVeiculos.get(5);
            bicicleta1 = (Bicicleta) listaVeiculos.get(6);
            bicicleta2 = (Bicicleta) listaVeiculos.get(7);
            aviao1 = (Aviao) listaVeiculos.get(8);
            aviao2 = (Aviao) listaVeiculos.get(9);
            helicoptero1 = (Helicoptero) listaVeiculos.get(10);
            helicoptero2 = (Helicoptero) listaVeiculos.get(11);
            submarino1 = (Submarino) listaVeiculos.get(12);
            submarino2 = (Submarino) listaVeiculos.get(13);
            barco1 = (Barco) listaVeiculos.get(14);
            barco2 = (Barco) listaVeiculos.get(15);


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
                System.out.println("2 - Barco");
                escolhaVeiculoAquatico = scanner.nextInt();
                break;
        }

        Veiculos veiculoEscolhido = null;

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
                    case 2: System.out.println("Escolha um modelo de barco: ");
                            System.out.println("1 - " + barco1.getModelo());
                            System.out.println("2 - " + barco2.getModelo());
                            int barcoEscolhido = scanner.nextInt();
                            veiculoEscolhido = (barcoEscolhido == 1) ? barco1 : barco2;
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
        } else if (veiculoEscolhido instanceof Barco) {
            System.out.println("6 - Ancorar");
            System.out.println("7 - Procurar tesouro");
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
                } else if (veiculoEscolhido instanceof Barco) {
                    ((Barco) veiculoEscolhido).ancorar();
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
                } else if (veiculoEscolhido instanceof Barco) {
                    ((Barco) veiculoEscolhido).tesouro();
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        scanner.close();
    }
}
