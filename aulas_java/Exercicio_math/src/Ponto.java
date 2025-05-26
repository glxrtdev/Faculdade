public class Ponto {

    private double x;
    private double y;

    public Ponto(){
        x = 0;
        y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        double dx = this.x - outroPonto.x;
        double dy = this.y - outroPonto.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double calcularDistancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));

    }
}