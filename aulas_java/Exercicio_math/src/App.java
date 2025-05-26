public class App {
    public static void main(String[] args) throws Exception {
       

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(2, 5);

        double distancia = p1.calcularDistancia(p2);

        System.out.println("Distância entre os pontos: " + distancia);

        System.out.println("Distância do ponto 2 às coordenadas (7,2): " + p2.calcularDistancia(7, 2));

        p1.setX(10);
        p1.setY(3);

        System.out.println("Os novos valores do ponto 1 são: \nX: " + p1.getX() + "\nY: " + p1.getY());
    }
}
