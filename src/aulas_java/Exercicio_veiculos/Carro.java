// - numeroPortas: int
// - tipoTransmissao: String
// - capacidadePortaMalas: float
// + Carro()
// + get/setNumeroPortas()
// + get/setTipoTransmissao()
// + get/setCapacidadePortaMalas()
// + ligarFarolNeblina()
// + abrirTetoSolar()


public class Carro extends VeiculosTerrestres {
    private int numeroPortas;
    private String tipoTransmissao;
    private float capacidadePortaMalas;


    public Carro(String modelo, int ano, String cor, boolean ligado, int numeroPortas, String tipoTransmissao, float capacidadePortaMalas, int numeroRodas){
        super(modelo, ano, cor, ligado, numeroRodas);
        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    // Getters
    public int getNumeroPortas(){
        return numeroPortas;
    }


    public String getTipoTransmissao(){
        return tipoTransmissao;
    }


    public float getCapacidadePortaMalas(){
        return capacidadePortaMalas;
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
           System.out.println("O carro está ligado");
    }

    @Override
    public void desligar() {
        this.ligado = false;
            System.out.println("O carro foi desligado");
        
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando");
    }

    @Override
    public void virar(){
        System.out.println("O carro está virando");
    }

    public void ligarFarolNeblina(){
        System.out.println("Farol de neblina ligado");
    }

    public void abrirTetoSolar(){
        System.out.println("Abrindo teto solar...");
    }


}
