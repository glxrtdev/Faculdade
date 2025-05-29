package controller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Evento;

public class EventoController {
    
    private List<Evento> eventos = new ArrayList<>();

    public void novoEvento(String nome, LocalDate data, String local, int lotacaoMaxima, int qtdeIngressos, double precoIngresso) {
        Evento novoEvento = new Evento(nome, data, local, lotacaoMaxima, qtdeIngressos, precoIngresso);
        eventos.add(novoEvento);
    }

    public void excluirEvento(String nome) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getNome().equals(nome)) {
                eventos.remove(i);
                break;
            }
        }
    }

    public List<model.Evento> listarEventos() {
        return eventos;
    }


}
