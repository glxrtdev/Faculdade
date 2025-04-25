public class Aviao extends VeiculosAereo{
    private double envergaduraAsa;
    private String tipoCombustivelAviao;

    public Aviao(String modelo, int ano, String cor, boolean ligado, int numeroMotores, double envergaduraAsa, String tipoCombustivelAviao){
        super(modelo, ano, cor, ligado, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivelAviao = tipoCombustivelAviao;
    }
    public void decolar(){
        System.out.println("O avião está decolando");
    }
    public void pousar(){
        System.out.println("O avião está pousando");
    }
    @Override
    public void ligar(){
        System.out.println("O avião está ligando");
    }
    @Override
    public void desligar(){
        System.out.println("O avião está desligando");

    }
}
