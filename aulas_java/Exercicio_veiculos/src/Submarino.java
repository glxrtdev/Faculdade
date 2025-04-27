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
    public void mergulhar(){
        System.out.println("O submarino está mergulhando");
    }
    public void emergir(){
        System.out.println("O submarino está emergindo");
    }
    @Override
    public void ligar(){
        System.out.println("O submarino está ligando");
    }
    @Override
    public void desligar(){
        System.out.println("O submarino está desligando");

    }
}
