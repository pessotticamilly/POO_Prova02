public class TrianguloIsosceles extends Formas {
    private double base, lado1, lado2;

    public TrianguloIsosceles(int codigo, double base, double lado1, double lado2) {
        super(codigo);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double area() {
        double ladoDiferente = 0, ladosIguais = 0;

        if(this.base != this.lado1 && this.base != this.lado2) {
            ladoDiferente = this.base;
        } else if (this.lado1 != this.base && this.lado1 != this.lado2){
            ladoDiferente = this.lado1;
        } else if (this.lado2 != this.base && this.lado2 != this.lado1){
            ladoDiferente = this.lado2;
        }

        if (ladoDiferente == this.base){
            ladosIguais = this.lado2;
        } else if (ladoDiferente == this.lado1){
            ladosIguais = this.base;
        } else if (ladoDiferente == this.lado2) {
            ladosIguais = this.lado1;
        }

        double altura = Math.sqrt((ladosIguais * ladosIguais) - ((ladoDiferente * ladoDiferente) / 4));

        return (ladoDiferente * altura) / 2;
    }

    @Override
    public double perimetro() {
        double ladoDiferente = 0, ladosIguais = 0;

        if(this.base != this.lado1 && this.base != this.lado2) {
            ladoDiferente = this.base;
        } else if (this.lado1 != this.base && this.lado1 != this.lado2){
            ladoDiferente = this.lado1;
        } else if (this.lado2 != this.base && this.lado2 != this.lado1){
            ladoDiferente = this.lado2;
        }

        if (ladoDiferente == this.base){
            ladosIguais = this.lado2;
        } else if (ladoDiferente == this.lado1){
            ladosIguais = this.base;
        } else if (ladoDiferente == this.lado2) {
            ladosIguais = this.lado1;
        }

        return ladoDiferente + 2 * ladosIguais;
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