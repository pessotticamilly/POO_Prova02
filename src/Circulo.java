public class Circulo extends Formas {
    private double raio;

    public Circulo(int codigo, double raio) {
        super(codigo);
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * (this.raio * this.raio);
    }

    @Override
    public double perimetro() {
        return 3.14 * 2 * this.raio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRaio: " + raio +
                "\nDiâmetro: " + (raio + raio) +
                "\nPerímetro: " + perimetro() +
                "\nÁrea: " + area();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}