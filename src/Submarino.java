public class Submarino extends VeiculosAquatico{
    
    private float profundidadeMaxima;

    public  Submarino(String modelo, int ano, String cor, boolean ligado, double comprimento, float profundidadeMaxima){
        super(modelo, ano, cor, ligado, comprimento);
        this.profundidadeMaxima = profundidadeMaxima;
    }
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
