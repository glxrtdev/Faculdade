package src.aulas_java.Exercicio_veiculos;

// - numeroRodas : int
// + VeiculoTerrestre()

public class VeiculosTerrestres extends Veiculos {
    private int numeroRodas;

    public VeiculosTerrestres(String modelo, int ano, String cor, boolean ligado, int numeroRodas){
        super(modelo, ano, cor, ligado);
        this.numeroRodas = numeroRodas;

    }

    public int getNumeroRodas(){
        return numeroRodas;
    }
}
