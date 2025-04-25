public class VeiculosAereo extends Veiculo{
    private int numeroMotores;
    


    public VeiculosAereo(String modelo, int ano, String cor, boolean ligado, int numeroMotores){
        super(modelo, ano, cor, ligado);
        this.numeroMotores = numeroMotores;
    }
}
