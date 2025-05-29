package controller;

import java.util.ArrayList;
import java.util.List;

import model.Reserva;

public class ReservaController {

    private List<Reserva> reservas = new ArrayList<>();


    public void novaReserva(String nome, int qtdePessoas) {
      Reserva novaReserva = new Reserva(nome, qtdePessoas);
        reservas.add(novaReserva);
    }

    public void excluirReserva(String nome) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getNome().equals(nome)) {
                reservas.remove(i);
                break;
            }
        }
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }
}
