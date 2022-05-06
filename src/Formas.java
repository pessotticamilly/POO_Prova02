import java.util.ArrayList;
public abstract class Formas {
    static ArrayList<Formas> listaFormas = new ArrayList<>();
    private int codigo;

    public Formas(int codigo) {
        this.codigo = codigo;
    }

    public static void cadastrar(int cont){
        listaFormas.add(Main.coletaDados(cont));
    }

    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return  "\nCódigo: " + codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}