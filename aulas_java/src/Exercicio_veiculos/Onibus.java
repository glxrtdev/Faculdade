package src.aulas_java.Exercicio_veiculos;

// - capacidadePassageiros: int
// - portasAcesso: int
// - numeroParadas: int
// + Onibus()
// + get/setCapacidadePassageiros()
// + get/setPortasAcesso()
// + get/setRotasItinerarios()
// + abrirPortaDianteira()
// + anunciarParadaProxima()


public class Onibus extends VeiculosTerrestres {
    private int capacidadePassageiros;
    private int portasAcesso;
    private int numeroParadas;

    public Onibus(String modelo, int ano, String cor, boolean ligado, int capacidadePassageiros, int portasAcesso, int numeroParadas, int numeroRodas){
        super(modelo, ano, cor, ligado, numeroRodas);
        this.capacidadePassageiros = capacidadePassageiros;
        this.portasAcesso = portasAcesso;
        this.numeroParadas = numeroParadas;
    }

    // Getters e Setters
    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }
   
    public int getPortasAcesso(){
        return portasAcesso;
    }
   
    public int getNumeroParadas(){
        return numeroParadas;
    }
    public void setNumeroParadas(int numeroParadas){
        this.numeroParadas = numeroParadas;
    }

    
    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }

    // Funções

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("O ônibus (" + getModelo() + ") está ligado");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("O ônibus (" + getModelo() + ") foi desligado");
    }

    @Override
    public void acelerar() {
        System.out.println("O ônibus (" + getModelo() + ") está acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("O ônibus (" + getModelo() + ") está freando");
    }

    @Override
    public void virar(){
        System.out.println("O ônibus (" + getModelo() + ") está virando");
    }

    public void abrirPortaDianteira(){
        System.out.println("Porta dianteira abrindo...");
    }
    public void anunciarParadaProxima(){
        System.out.println("Próxima parada chegando.");

    }
}
