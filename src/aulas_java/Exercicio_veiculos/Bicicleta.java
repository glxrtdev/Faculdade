package src.aulas_java.Exercicio_veiculos;

// - numeroMarchas: int
// - tipoFreio: String
// - estiloQuadro: String
// + Bicicleta()
// + get/setNumeroMarchas()
// + get/setTipoFreio()
// + get/setEstiloQuadro()
// + pedalar()
// + parar()


public class Bicicleta extends VeiculosTerrestres{
    private int numeroMarchas;
    private String tipoFreio;
    private String estiloQuadro;

    public Bicicleta(String modelo, int ano, String cor, boolean ligado, int numeroMarchas, String tipoFreio, String estiloQuadro, int numeroRodas){
        super(modelo, ano, cor, ligado, numeroRodas);
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
        this.estiloQuadro = estiloQuadro;
    }

    //Getters
    public int getNumeroMarchas(){
        return numeroMarchas;
    }
   
    public String getTipoFreio(){
        return tipoFreio;
    }
   

    public String getEstiloQuadro(){
        return estiloQuadro;
    }

    // Mostra exatamente o veículo escolhido
    @Override
    public String toString(){
        return "Modelo: " + getModelo() + ", Ano: " + getAno() + ", Cor: " + getCor();
    }
    
    //Funções
    public void pedalar(){
        System.out.println("Pedaaaala");
    }

    public void parar(){
        System.out.println("Parando...");
    }
}
