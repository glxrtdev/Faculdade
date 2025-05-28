package controller;

import model.Carro;
import model.Estacionamento;

public class EstacionamentoController {
    private Estacionamento estacionamento;

    public EstacionamentoController(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public boolean registrarEntrada(String modelo, String placa, String cor) {
        Carro carro = new Carro(modelo, placa, cor);
        return estacionamento.entradaVeiculos(carro);
    }

    public boolean registrarSaida(String placa) {
        return estacionamento.saidaVeiculos(placa);
    }

    public int getEntradas() {
        return estacionamento.getEntradas();
    }

    public int getSaidas() {
        return estacionamento.getSaidas();
    }

    public double getValorTotal() {
        return estacionamento.getValorTotal();
    }

    public boolean temVaga() {
        return estacionamento.temVaga();
    }
}
