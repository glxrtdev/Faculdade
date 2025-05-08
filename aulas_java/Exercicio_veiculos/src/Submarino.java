package src.aulas_java.Exercicio_veiculos;

// - profundidadeMaxima : float
// + Submarino()
// + mergulhar() : void
// + emergir() : void

public class Submarino extends VeiculosAquaticos{
    
    private float profundidadeMaxima;

    public  Submarino(String modelo, int ano, String cor, boolean ligado, double comprimento, float profundidadeMaxima){
        super(modelo, ano, cor, ligado, comprimento);
        this.profundidadeMaxima = profundidadeMaxima;
    }
    //Getters
    public float getProfundidadeMaxima(){
        return profundidadeMaxima;
    }

    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }

    //Funções
    @Override
    public void ligar(){
        System.out.println("O submarino (" + getModelo() + ") está ligado");
    }
    @Override
    public void desligar(){
        System.out.println("O submarino (" + getModelo() + ") foi desligado");

    }
    @Override
    public void acelerar() {
        System.out.println("O submarino (" + getModelo() + ") está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O submarino (" + getModelo() + ") está freando");
    }

    @Override
    public void virar(){
        System.out.println("O submarino (" + getModelo() + ") está virando");
    }
    public void mergulhar(){
        System.out.println("O submarino (" + getModelo() + ") está mergulhando");
    }
    public void emergir(){
        System.out.println("O submarino (" + getModelo() + ") está emergindo");
    }
    
}
