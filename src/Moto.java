// - cilindradas: int
// - tipoCombustivel: String
// - tipoFreio: String
// + Moto()
// + get/setCilindradas()
// + get/setTipoCombustivel()
// + get/setTipoFreio()
// + ativarModoEsportivo()
// + ligarPartidaEletrica()


public class Moto extends Veiculo{
    private int cilindradas;
    private String tipoCombustivel;
    private String tipoFreio;

    public Moto(String modelo, int ano, String cor, boolean ligado, int cilindradas, String tipoCombustivel, String tipoFreio){
        super(modelo, ano, cor, ligado);
        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoFreio = tipoFreio;
    }

    // Getters e Setters
    public int getCilindradas(){
        return cilindradas;
    }


    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public String getTipoFreio(){
        return tipoFreio;
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
            System.out.println("A moto já está ligada");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado) {
            super.desligar();
        } else {
            System.out.println("A moto já está desligada");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando");
    }

    @Override
    public void virar(){
        System.out.println("A moto está virando");
    }

    public void ativarModoEsportivo(){
            System.out.println("Modo esportivo ativado!");
    }
    public void ligarPartidaEletrica(){
            System.out.println("Partida elétrica ligada.");
    }
}
