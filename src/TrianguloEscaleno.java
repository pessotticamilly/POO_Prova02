public class TrianguloEscaleno extends Formas {
    private double base, lado1, lado2;

    public TrianguloEscaleno(int codigo, double base, double lado1, double lado2) {
        super(codigo);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        double semiperimetro = perimetro() / 2;

        return Math.sqrt(semiperimetro * (semiperimetro - this.base) * (semiperimetro - this.lado1) * (semiperimetro - this.lado2));
    }

    @Override
    public double perimetro() {
        return this.base + this.lado1 + this.lado2;
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