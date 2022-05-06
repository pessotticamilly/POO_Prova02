public class Retangulo extends Formas {
    private double altura, base;

    public Retangulo(int codigo, double altura, double base) {
        super(codigo);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        return this.altura * this.base;
    }

    @Override
    public double perimetro() {
        return 2 * (this.altura + this.base);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAltura: " + altura +
                "\nBase: " + base +
                "\nPerímetro: " + perimetro() +
                "\nÁrea: " + area();

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
}