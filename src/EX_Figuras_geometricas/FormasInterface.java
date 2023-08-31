package EX_Figuras_geometricas;

import EX_Contatos.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class FormasInterface {
    private Scanner scanner;

    private Controller controller;

    public FormasInterface(){
        scanner = new Scanner(System.in);
        controller = new Controller();
    }

    private int getOpcao(){
        System.out.println("1. Incluir");
        System.out.println("2. Listar");
        System.out.println("0. Sair");
        System.out.println("Opcao: ");

        return scanner.nextInt();
    }

    private void escolhaForma(){
        System.out.println("1. Circulo");
        System.out.println("2. Retangulo");
        System.out.println("3. Trapezio");
        System.out.println("4. Triangulo");
        System.out.println("Opcao: ");

        int forma = scanner.nextInt();
        addFormaInterface(forma);
    }

    private void addFormaInterface(int forma){

        switch (forma){
            case 1 -> addCirculo();
            case 2 -> addRetangulo();
            case 3 -> addTrapezio();
            case 4 -> addTriangulo();
        }
    }

    private void addTriangulo() {
        double cateto1, cateto2;

        System.out.print("Cateto 1: ");
        cateto1 = scanner.nextDouble();

        System.out.print("Cateto 2: ");
        cateto2 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(cateto1, cateto2);
        controller.addForma(triangulo);
    }

    private void addTrapezio() {
        double altura, lado1, lado2, base1, base2;

        System.out.print("Lado 1: ");
        lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        lado2 = scanner.nextDouble();

        System.out.print("Base 1: ");
        base1 = scanner.nextDouble();

        System.out.print("Base 2: ");
        base2 = scanner.nextDouble();

        System.out.print("Altura: ");
        altura = scanner.nextDouble();

        Trapezio trapezio = new Trapezio(altura, lado1, lado2, base1, base2);
        controller.addForma(trapezio);
    }

    private void addRetangulo() {
        double lado1, lado2;

        System.out.print("Lado 1: ");
        lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        lado2 = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(lado1, lado2);
        controller.addForma(retangulo);

    }

    private void addCirculo() {
        int raio;

        System.out.print("Raio: ");
        raio = scanner.nextInt();

        Circulo circulo = new Circulo(raio);
        controller.addForma(circulo);
    }

    private void getFormas() {
        ArrayList<Forma> formas = controller.getFormas();
        Forma forma = null;

        for(Forma value: formas){
            forma = value;
            System.out.println("forma: " + forma.getArea() +
                    " Telefone: " + forma.getPerimetro());
        }
    }

    public void executar(){
        int opcao = 0;

        do{
            opcao = getOpcao();

            switch (opcao){
                case 1 -> escolhaForma();
                case 2 -> getFormas();
            }
        } while (opcao != 0);
    }
}
