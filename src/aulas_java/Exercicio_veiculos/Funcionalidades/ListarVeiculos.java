package src.aulas_java.Exercicio_veiculos.Funcionalidades;

import java.util.List;

import src.aulas_java.Exercicio_veiculos.Veiculo;

public class ListarVeiculos {
    

    public void listarVeiculos(List<Veiculo> listaDeVeiculos){
        for (Veiculo veiculo : listaDeVeiculos) {
            System.out.println("Tipo: " + veiculo.getClass().getSimpleName());
            }
}
}