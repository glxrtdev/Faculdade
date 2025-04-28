package src.aulas_java.Exercicio_veiculos;

// - numeroMotores : int
// + VeiculoAereo()

public class VeiculosAereos extends Veiculos{
    private int numeroMotores;

    public VeiculosAereos(String modelo, int ano, String cor, boolean ligado, int numeroMotores){
        super(modelo, ano, cor, ligado);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores(){
        return numeroMotores;
    }
}
