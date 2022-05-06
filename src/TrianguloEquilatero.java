public class TrianguloEquilatero extends Formas {
    private double base, lado1, lado2;

    public TrianguloEquilatero(int codigo, double base, double lado1, double lado2) {
        super(codigo);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * (this.lado1 * this.lado2);
    }

    @Override
    public double perimetro() {
        return 3 * this.base;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBase: " + base +
                "\nLado 1: " + lado1 +
                "\nLado 2: " + lado2 +
                "\nPerímetro: " + perimetro() +
                "\nÁrea: " + area();
    }
}