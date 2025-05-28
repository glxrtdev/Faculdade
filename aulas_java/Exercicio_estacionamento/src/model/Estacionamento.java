package model;

import java.util.List;
import java.util.ArrayList;

public class Estacionamento {
    
    private List<Carro> vagas;
    private final int capacidade = 10;
    private int entradas;
    private int saidas;
    private double valorTotal;

    public Estacionamento() {
        this.vagas = new ArrayList<>();
        this.entradas = 0;
        this.saidas = 0;
        this.valorTotal = 0;
    }
    
    public boolean entradaVeiculos(Carro carro) {
        if (vagas.size() < capacidade) {
            vagas.add(carro);
            entradas++;
            return true;
        }
        return false;
    }

    public boolean saidaVeiculos(String placa) {
        for (Carro c : vagas) {
             if (c.getPlaca().equalsIgnoreCase(placa)) {
                vagas.remove(c);
                saidas++;
                valorTotal += 5.00;
            return true;
            }  
        }   
         return false;
    }

    public int getEntradas() {
        return entradas;
    }

    public int getSaidas() {
        return saidas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Carro> vagas() {
        return vagas;
    }

    public boolean temVaga() {
        return vagas.size() < capacidade;
    }
   
}
