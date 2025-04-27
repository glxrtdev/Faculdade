// - numeroHelices : int
// - capacidadeCarga : float
// + Helicoptero()
// + pairar() : void
// + resgatarPessoas() : void

public class Helicoptero extends VeiculosAereos {
    
    private int numeroHelices;
    private float capacidadeCarga;
    
    public Helicoptero(String modelo, int ano, String cor, boolean ligado, int numeroMotores, int numeroHelices, float capacidadeCarga){
        super(modelo, ano, cor, ligado, numeroMotores);
        this.numeroHelices = numeroHelices;
        this.capacidadeCarga = capacidadeCarga;

    }
    
    //Getters
    public int getNumeroHelices(){
        return numeroHelices;
    }
    public float getCapacidadeCarga(){
        return capacidadeCarga;
    }

    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }

    //Funções
    public void pairar(){
        System.out.println("O helicóptero esta pairando");

    }
    public void  resgatarPessoas(){
        System.out.println("Resgate concluído");
    } 

    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("O helicóptero está ligando");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("O helicóptero está desligando");

    }
}
