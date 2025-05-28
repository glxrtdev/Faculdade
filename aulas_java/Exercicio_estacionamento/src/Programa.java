import controller.EstacionamentoController;
import model.Estacionamento;
import view.MenuView;
import view.RelatorioView;

public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoController controller = new EstacionamentoController(estacionamento);
        MenuView menu = new MenuView();
        RelatorioView relatorio = new RelatorioView();

        boolean executando = true;

        while (executando) {
            int opcao = menu.mostrarMenu();

            switch (opcao) {
                case 1:
                    if (controller.temVaga()) {
                        String modelo = menu.solicitar("Modelo: ");
                        String placa = menu.solicitar("Placa: ");
                        String cor = menu.solicitar("Cor: ");
                        if (controller.registrarEntrada(modelo, placa, cor)) {
                            System.out.println("Carro registrado com sucesso.");
                        } else {
                            System.out.println("Erro ao registrar carro.");
                        }
                    } else {
                        System.out.println("Estacionamento cheio.");
                    }
                    break;

                case 2:
                    String placaSaida = menu.solicitar("Placa do carro para saída: ");
                    if (controller.registrarSaida(placaSaida)) {
                        System.out.println("Carro removido com sucesso.");
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;

                case 3:
                    relatorio.relatorio(
                        controller.getEntradas(),
                        controller.getSaidas(),
                        controller.getValorTotal()
                    );
                    break;

                case 0:
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
    }
}
