public class Quadrado extends Formas {
    private double lado;

    public Quadrado(int codigo, double lado) {
        super(codigo);
        this.lado = lado;
    }

    @Override
    public double area() {
       return this.lado * this.lado;
    }

    @Override
    public double perimetro() {
       return this.lado * 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLado: " + lado +
                "\nPerímetro: " + perimetro() +
                "\nÁrea: " + area();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}