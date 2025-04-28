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
    public void decolar(){
        System.out.println("O avião (" + getModelo() + ") está decolando");
    }
    public void pousar(){
        System.out.println("O avião (" + getModelo() + ") está pousando");
    }
    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("O avião (" + getModelo() + ") está ligando");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("O avião (" + getModelo() + ") está desligando");

    }
}
