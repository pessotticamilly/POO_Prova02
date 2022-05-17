import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cont = 0;

        Professor.listaProfessores.add(new Professor(1, "1"));
        Formas.listaFormas.add(new Quadrado(1, 2));
        Formas.listaFormas.add(new Quadrado(2, 4));
        Formas.listaFormas.add(new Circulo(3, 2));
        Formas.listaFormas.add(new Circulo(4, 4));
        Formas.listaFormas.add(new TrianguloIsosceles(1, 2, 2, 3));

        login(cont);
    }

    private static void login(int cont) {
        System.out.print("\n---- LOGIN ----" +
                "\nSenha: ");
        String senha = sc.next();

        verificacaoLogin(senha, cont);
    }

    private static void verificacaoLogin(String senha, int cont) {
        for (int i = 0; i < Professor.listaProfessores.size(); i++) {
            if (senha.equals(Professor.listaProfessores.get(i).getSenha())) {
                cont = 0;
                menu(cont);
            } else {
                cont = cont + 1;

                if (cont > 3) {
                    System.out.print("\nEncerrando... ");
                    System.exit(0);
                }

                System.out.print("\nSenha incorreta! Tente novamente: ");
                login(cont);
            }
        }
    }

    public static void menu(int cont) {
        System.out.print("\n---- MENU ----" +
                "\n1 - Cadastrar formas" +
                "\n2 - Listar formas" +
                "\n3 - Sair" +
                "\nR: ");
        int opcaoMenu = sc.nextInt();

        switch (opcaoMenu) {
            case 1:
                Formas.cadastrar(cont);
                menu(cont);
                break;

            case 2:
                listar(cont);
                menu(cont);
                break;

            case 3:
                login(cont);
                break;
        }
    }

    private static int tipoCadastro() {
        System.out.print("\nQual forma?" +
                "\n1 - Círculo" +
                "\n2 - Triângulo" +
                "\n3 - Retângulo" +
                "\n4 - Quadrado" +
                "\nR: ");
        return sc.nextInt();
    }

    public static Formas coletaDados(int cont) {
        int tipoForma = tipoCadastro();

        System.out.print("\nCódigo: ");
        int codigo = sc.nextInt();

        double base;

        switch (tipoForma) {
            case 1:
                System.out.print("Raio: ");
                double raio = sc.nextDouble();

                return new Circulo(codigo, raio);

            case 2:
                System.out.print("Base: ");
                base = sc.nextDouble();

                System.out.print("Lado 1: ");
                double lado1 = sc.nextDouble();

                System.out.print("Lado 2: ");
                double lado2 = sc.nextDouble();

                if (base == lado1 && base == lado2 && lado1 == lado2) {
                    return new TrianguloEquilatero(codigo, base, lado1, lado2);
                } else if (base == lado1 || base == lado2 || lado1 == base || lado1 == lado2 || lado2 == base || lado2 == lado1) {
                    return new TrianguloIsosceles(codigo, base, lado1, lado2);
                } else if (base != lado1 && base != lado2 && lado1 != lado2) {
                    return new TrianguloEscaleno(codigo, base, lado1, lado2);
                } else {
                    System.out.print("\nValores inválidos!");
                    menu(cont);
                }

            case 3:
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                System.out.print("Base: ");
                base = sc.nextDouble();

                if (altura != base) {
                    return new Retangulo(codigo, altura, base);
                } else {
                    System.out.print("\nValores inválidos!");
                    menu(cont);
                }

            case 4:
                System.out.print("Lado: ");
                double lado = sc.nextDouble();

                return new Quadrado(codigo, lado);
        }

        return null;
    }

    public static int tipoListar() {
        System.out.print("\nQual forma?" +
                "\n1 - Círculo" +
                "\n2 - Triângulo" +
                "\n3 - Retângulo" +
                "\n4 - Quadrado" +
                "\n5 - Todos" +
                "\n6 - Voltar" +
                "\nR: ");
        return sc.nextInt();
    }

    private static void listar(int cont) {
        int tipoListar = tipoListar();

        switch (tipoListar) {
            case 1:
                System.out.print("\nCÍRCULO");
                for (int i = 0; i < Formas.listaFormas.size(); i++) {
                    if (Formas.listaFormas.get(i) instanceof Circulo) {
                        System.out.print(Formas.listaFormas.get(i).toString() + "\n---------------\n");
                    }
                }

                listar(cont);
                break;

            case 2:
                System.out.print("\nTRIÂNGULO");
                for (int i = 0; i < Formas.listaFormas.size(); i++) {
                    if (Formas.listaFormas.get(i) instanceof TrianguloIsosceles || Formas.listaFormas.get(i) instanceof TrianguloEscaleno || Formas.listaFormas.get(i) instanceof TrianguloEquilatero) {
                        System.out.print(Formas.listaFormas.get(i).toString() + "\n---------------\n");
                    }
                }

                listar(cont);
                break;

            case 3:
                System.out.print("\nRETÂNGULO");
                for (int i = 0; i < Formas.listaFormas.size(); i++) {
                    if (Formas.listaFormas.get(i) instanceof Retangulo) {
                        System.out.print(Formas.listaFormas.get(i).toString() + "\n---------------\n");
                    }
                }

                listar(cont);
                break;

            case 4:
                System.out.print("\nQUADRADO");
                for (int i = 0; i < Formas.listaFormas.size(); i++) {
                    if (Formas.listaFormas.get(i) instanceof Quadrado) {
                        System.out.print(Formas.listaFormas.get(i).toString() + "\n---------------\n");
                    }
                }

                listar(cont);
                break;

            case 5:
                for (int i = 0; i < Formas.listaFormas.size(); i++) {
                    System.out.print(Formas.listaFormas.get(i).toString() + "\n---------------\n");
                }
                break;

            case 6:
                menu(cont);
                break;
        }
    }
}
