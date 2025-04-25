public class Helicoptero extends VeiculosAereo {
    
    private int numeroHelices;
    private float capacidadeCarga;
    
    public Helicoptero(String modelo, int ano, String cor, boolean ligado, int numeroMotores, int numeroHelices, float capacidadeCarga){
        super(modelo, ano, cor, ligado, numeroMotores);
        this.numeroHelices = numeroHelices;
        this.capacidadeCarga = capacidadeCarga;

    }
    public void pairar(){
        System.out.println("O helicóptero esta pairando");

    }
    public void  resgatarPessoas(){
        System.out.println("Resgate concluído");
    } 

    @Override
    public void ligar(){
        System.out.println("O helicóptero está ligando");
    }
    @Override
    public void desligar(){
        System.out.println("O helicóptero está desligando");

    }
}
