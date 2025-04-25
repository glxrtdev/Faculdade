public class VeiculosAquatico extends Veiculo {
    private double comprimento;

    public VeiculosAquatico(String modelo, int ano, String cor, boolean ligado, double comprimento){
        super(modelo, ano, cor, ligado);
        this.comprimento = comprimento;
    }
}
