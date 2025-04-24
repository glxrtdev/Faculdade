// - capacidadePassageiros: int
// - portasAcesso: int
// - numeroParadas: int
// + Onibus()
// + get/setCapacidadePassageiros()
// + get/setPortasAcesso()
// + get/setRotasItinerarios()
// + abrirPortaDianteira()
// + anunciarParadaProxima()


public class Onibus extends Veiculo {
    private int capacidadePassageiros;
    private int portasAcesso;
    private int numeroParadas;

    public Onibus(String modelo, int ano, String cor, boolean ligado, int capacidadePassageiros, int portasAcesso, int numeroParadas){
        super(modelo, ano, cor, ligado);
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
        if(!this.ligado){
            super.ligar();
        } else {
            System.out.println("O ônibus já está ligado");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado) {
            super.desligar();
        } else {
            System.out.println("O ônibus já está desligado");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("O ônibus está acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("O ônibus está freando");
    }

    @Override
    public void virar(){
        System.out.println("O ônibus está virando");
    }

    public void abrirPortaDianteira(){
        System.out.println("Porta dianteira abrindo...");
    }
    public void anunciarParadaProxima(){
        System.out.println("Próxima parada chegando.");

    }
}
