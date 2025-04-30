package src.aulas_java.Exercicio_veiculos.Funcionalidades;

import java.util.List;

import src.aulas_java.Exercicio_veiculos.Veiculos;

public class ListarVeiculos {
    

    public static void listarVeiculos(List<Veiculos> listaDeVeiculos){
        for (Veiculos veiculo : listaDeVeiculos) {
            String tipo = veiculo.getClass().getSimpleName();
            String modelo = veiculo.getModelo(); 
            String cor = veiculo.getCor();       
    
            System.out.println("Tipo: " + tipo + " | Modelo: " + modelo + " | Cor: " + cor);
        }
}
}