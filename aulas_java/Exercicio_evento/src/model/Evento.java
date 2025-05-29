package model;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate data;
    private String local;
    private int lotacaoMaxima;
    private int qtdeIngressos;
    private double precoIngresso;

    public Evento(String nome, LocalDate data, String local, int lotacaoMaxima, int qtdeIngressos, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
        this.qtdeIngressos = qtdeIngressos;
        this.precoIngresso = precoIngresso;
    }

    // Getters

    public String getNome() {
        return nome;
    }
    public LocalDate getData() {
        return data;
    }
    public String getLocal() {
        return local;
    }
    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }
    public int getQtdeIngressos() {
        return qtdeIngressos;
    }
    public double getPrecoIngresso() {
        return precoIngresso;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacaoMaxima = lotacaoMaxima;
    }
    public void setQtdeIngressos(int qtdeIngressos) {
        this.qtdeIngressos = qtdeIngressos;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    
    public boolean estaLotado() {
        return qtdeIngressos >= lotacaoMaxima;
    }
    public double calcularValorTotal() {
        return qtdeIngressos * precoIngresso;
    }
}
