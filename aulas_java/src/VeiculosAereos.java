// - numeroMotores : int
// + VeiculoAereo()

public class VeiculosAereos extends Veiculo{
    private int numeroMotores;

    public VeiculosAereos(String modelo, int ano, String cor, boolean ligado, int numeroMotores){
        super(modelo, ano, cor, ligado);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores(){
        return numeroMotores;
    }
}
