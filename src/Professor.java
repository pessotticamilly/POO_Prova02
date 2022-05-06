import java.util.ArrayList;

public class Professor {
    static ArrayList<Professor> listaProfessores = new ArrayList<>();
    private int codigo;
    private String senha;

    public Professor(int codigo, String senha) {
        this.codigo = codigo;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}