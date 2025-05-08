package aulas_java.Exercicio_veiculos.src.Funcionalidades;

import java.util.List;

import aulas_java.Exercicio_veiculos.src.*;

public class InstanciadorVeiculos {

    public static void adicionarVeiculosPadrao(List<Veiculos> lista) {
        // Terrestres
        lista.add(new Carro("Corsa", 2008, "Preto", false, 2, "Manual", 200, 4));
        lista.add(new Carro("Celta", 2004, "Branco", false, 2, "Manual", 235, 4));
        lista.add(new Moto("CG", 2002, "Cinza", false, 150, "Gasolina", "Disco", 2));
        lista.add(new Moto("XJ6", 2014, "Dourado", false, 600, "Gasolina", "Disco", 2));
        lista.add(new Onibus("Marcopolo", 2010, "Azul", false, 54, 3, 12, 8));
        lista.add(new Onibus("Mercedes", 2018, "Verde", false, 45, 3, 15, 8));
        lista.add(new Bicicleta("Caloi", 2021, "Vermelha", false, 18, "Disco", "Urbana", 2));
        lista.add(new Bicicleta("Sense", 2023, "Preta", false, 24, "Disco", "Montanha", 2));

        // Aéreos
        lista.add(new Aviao("Boing 747", 2001, "Branco", false, 4, 64.4, "AVGAS"));
        lista.add(new Aviao("AirBus A380", 2002, "Azul", false, 4, 79.8, "AVGAS"));
        lista.add(new Helicoptero("BK 117 D-2", 2017, "Preto", false, 2, 3, 1781));
        lista.add(new Helicoptero("BK 117 D-3", 2025, "Prata", false, 2, 3, 2000));

        // Aquáticos
        lista.add(new Submarino("K63n", 2005, "Preto", false, 71.4, 11000));
        lista.add(new Submarino("K25n", 2025, "Preto", false, 71.4, 7000));
        lista.add(new Barco("Lancha", 2021, "Branco", false, 4, 6));
        lista.add(new Barco("Pirata", 1500, "Preto", false, 8, 12));
    }
}
