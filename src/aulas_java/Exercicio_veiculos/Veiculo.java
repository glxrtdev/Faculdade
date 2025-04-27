// - modelo: String
// - ano: int
// - cor: String
// - ligado: boolean
// + Veiculo()
// + get/setModelo()
// + get/setAno()
// + get/setCor()
// + ligar()
// + desligar()
// + acelerar()
// + frear()
// + virar()


public class Veiculo {
    private String modelo;
    private int ano;
    private String cor;
    protected boolean ligado;


    
    public Veiculo(String modelo, int ano, String cor, boolean ligado){
       this.modelo = modelo;
       this.ano = ano;
       this.cor = cor;
       this.ligado = ligado;
    }

    // Getters e Setters
    public String getModelo(){
        return modelo;
    }


    public int getAno(){
        return ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    // Funções do carro
    public void ligar(){
        this.ligado = true;
       
    }

    public void desligar(){
        this.ligado = false;
    }

    public void virar(){
        
    }

    public void acelerar(){
        
    }

    public void frear(){
        
    }

    public String isLigado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLigado'");
    }
    
}


