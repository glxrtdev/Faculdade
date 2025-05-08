package src.aulas_java.Exercicio_veiculos;

public class Barco extends VeiculosAquaticos{

    private int tripulantes;

    public Barco(String modelo, int ano, String cor, boolean ligado, double comprimento, int tripulantes){
        super(modelo, ano, cor, ligado, comprimento);
        this.tripulantes = tripulantes;
    }

    //Getters
    public int getTripulantes(){
        return tripulantes;
    }

    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }

    //Funções
    @Override
    public void ligar(){
        System.out.println("O barco (" + getModelo() + ") está ligado");
    }
    @Override
    public void desligar(){
        System.out.println("O barco (" + getModelo() + ") foi desligado");

    }
    @Override
    public void acelerar() {
        System.out.println("O barco (" + getModelo() + ") está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O barco (" + getModelo() + ") está freando");
    }

    @Override
    public void virar(){
        System.out.println("O barco (" + getModelo() + ") está virando");
    }

    public void ancorar(){
        System.out.println("O barco (" + getModelo() + ") está ancorando");
    }

    public void tesouro(){
        System.out.println("O barco (" + getModelo() + ") achou um tesouro!");
    }
}
