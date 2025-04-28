package src.aulas_java.Exercicio_veiculos;

// - comprimento : float
// + VeiculoAquatico()

public class VeiculosAquaticos extends Veiculos {
    private double comprimento;

    public VeiculosAquaticos(String modelo, int ano, String cor, boolean ligado, double comprimento){
        super(modelo, ano, cor, ligado);
        this.comprimento = comprimento;
    }

    public double getComprimento(){
        return comprimento;
    }
}
