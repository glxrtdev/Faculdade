import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        Carro carro1 = new Carro("Corsa", 2008, "Preto", false, 2, "Manual", 200);
        Carro carro2 = new Carro("Celta", 2004, "Branco", false, 2, "Manual", 235);

        Moto moto1 = new Moto("CG", 2002, "Cinza", false, 150, "Gasolina", "Disco");
        Moto moto2 = new Moto("XJ6", 2014, "Dourado", false, 600, "Gasolina", "Disco");

        Onibus onibus1 = new Onibus("Marcopolo", 2010,  "Azul", false, 54, 3, 12);
        Onibus onibus2 = new Onibus("Escolhe essa não",  2018, "Verde", false, 45, 3, 15);

        Bicicleta bicicleta1 = new Bicicleta("Caloi", 2021, "Vermelha", false, 18, "Disco", "Urbana");
        Bicicleta bicicleta2 = new Bicicleta("Sense", 2023, "Preta", false, 24, "Disco", "Montanha");

        
        System.out.println("Escolha um veículo:");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Ônibus");
        System.out.println("4 - Bicicleta");
        System.out.print("Digite o número da opção desejada: ");
        int escolhaVeiculo = scanner.nextInt();

        if (escolhaVeiculo < 1 || escolhaVeiculo > 4) {
            System.out.println("Opção inválida!");
            return;
        }

        Veiculo veiculoEscolhido = null;

        switch (escolhaVeiculo) {
            case 1: System.out.println("Escolha um modelo de carro: ");
                    System.out.println("1 - " + carro1.getModelo());
                    System.out.println("2 - " + carro2.getModelo());
                    int carroEscolhido = scanner.nextInt();
                    veiculoEscolhido = (carroEscolhido == 1) ? carro1 : carro2;
                    break;

            case 2: System.out.println("Escolha um modelo de moto: ");
                    System.out.println("1 - " + moto1.getModelo());
                    System.out.println("2 - " + moto2.getModelo());
                    int motoEscolhida = scanner.nextInt();
                    veiculoEscolhido = (motoEscolhida == 1) ? moto1 : moto2;
                    break;

            case 3: System.out.println("Escolha um modelo de ônibus: ");
                    System.out.println("1 - " + onibus1.getModelo());
                    System.out.println("2 - " + onibus2.getModelo());
                    int onibusEscolhido = scanner.nextInt();
                    veiculoEscolhido = (onibusEscolhido == 1) ? onibus1 : onibus2;
                    break;

            case 4: System.out.println("Escolha o modelo da bicicleta: ");
                    System.out.println("1 - " + bicicleta1.getModelo());
                    System.out.println("2 - " + bicicleta2.getModelo());
                    int bicicletaEscolhida = scanner.nextInt();
                    veiculoEscolhido = (bicicletaEscolhida == 1) ? bicicleta1 : bicicleta2;
                    break;
            default:
                System.out.println("Opção escolhida inválida.");
                break;
        }

            System.out.println("Você escolheu o veículo abaixo.");
            System.out.println(veiculoEscolhido);

            
        // Ações gerais
        System.out.println("\nEscolha uma ação:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Frear");
        System.out.println("5 - Virar");
        
        // Ações únicas
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
        }
        int opcaoAcao = scanner.nextInt();

        switch (opcaoAcao) {
            case 1: veiculoEscolhido.ligar();
                break;
            case 2: veiculoEscolhido.desligar();
                break;
            case 3: veiculoEscolhido.acelerar();
                break;
            case 4: veiculoEscolhido.frear();
                break;
            case 5: veiculoEscolhido.virar();
                break;
            case 6: 
                if(veiculoEscolhido instanceof Carro){
                    Carro c = (Carro) veiculoEscolhido;
                    c.ligarFarolNeblina();
                } else if (veiculoEscolhido instanceof Moto){
                    Moto m = (Moto) veiculoEscolhido;
                    m.ativarModoEsportivo();
                } else if (veiculoEscolhido instanceof Onibus){
                    Onibus o = (Onibus) veiculoEscolhido;
                    o.abrirPortaDianteira();
                } else if (veiculoEscolhido instanceof Bicicleta){
                    Bicicleta b = (Bicicleta) veiculoEscolhido;
                    b.pedalar();
                }
                break;
            case 7: 
                if(veiculoEscolhido instanceof Carro){
                    Carro c = (Carro) veiculoEscolhido;
                    c.abrirTetoSolar();
                } else if (veiculoEscolhido instanceof Moto){
                    Moto m = (Moto) veiculoEscolhido;
                    m.ligarPartidaEletrica();
                } else if (veiculoEscolhido instanceof Onibus){
                    Onibus o = (Onibus) veiculoEscolhido;
                    o.anunciarParadaProxima();
                } else if (veiculoEscolhido instanceof Bicicleta){
                    Bicicleta b = (Bicicleta) veiculoEscolhido;
                    b.parar();
                }
                break;
            default:
                System.out.println( "Opcão inválida!");
                break;
        }

        scanner.close();
    }
}
