package model;

public class Reserva {
    private String nome;
    private int qtdePessoas;

    public Reserva(String nome, int qtdePessoas) {
        this.nome = nome;
        this.qtdePessoas = qtdePessoas;
    }

    // Getters

    public String getNome() {
        return nome;
    }
    public int getQtdePessoas() {
        return qtdePessoas;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

}