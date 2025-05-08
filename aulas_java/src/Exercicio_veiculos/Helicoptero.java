package src.aulas_java.Exercicio_veiculos;

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
    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("O helicóptero (" + getModelo() + ") está ligado");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("O helicóptero (" + getModelo() + ") foi desligado");

    }
    @Override
    public void acelerar() {
        System.out.println("O helicóptero (" + getModelo() + ") está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O helicóptero  (" + getModelo() + ") está freando");
    }

    @Override
    public void virar(){
        System.out.println("O helicóptero  (" + getModelo() + ") está virando");
    }
    public void pairar(){
        System.out.println("O helicóptero (" + getModelo() + ") esta pairando");

    }
    public void  resgatarPessoas(){
        System.out.println("Resgate concluído");
    } 

    
}
