package src.aulas_java.Exercicio_veiculos;

// - envergaduraAsa : float
// - tipoCombustivel : String
// + Aviao()
// + decolar() : void
// + pousar() : void

public class Aviao extends VeiculosAereos{
    private double envergaduraAsa;
    private String tipoCombustivelAviao;

    public Aviao(String modelo, int ano, String cor, boolean ligado, int numeroMotores, double envergaduraAsa, String tipoCombustivelAviao){
        super(modelo, ano, cor, ligado, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivelAviao = tipoCombustivelAviao;
    }

    //Getters
    public double getEnvergaduraAsa(){
        return envergaduraAsa;
    }
    public String getTipoCombustivelAviao(){
        return tipoCombustivelAviao;
    }

    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }

    // Funções
    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("O avião (" + getModelo() + ") está ligado");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("O avião (" + getModelo() + ") foi desligado");

    }
    @Override
    public void acelerar() {
        System.out.println("O avião (" + getModelo() + ") está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O avião (" + getModelo() + ") está freando");
    }

    @Override
    public void virar(){
        System.out.println("O avião (" + getModelo() + ") está virando");
    }

    public void decolar(){
        System.out.println("O avião (" + getModelo() + ") está decolando");
    }
    public void pousar(){
        System.out.println("O avião (" + getModelo() + ") está pousando");
    }
    
}
