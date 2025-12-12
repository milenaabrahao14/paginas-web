import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite o lado A: ");
        a = input.nextDouble();

        System.out.print("Digite o lado B: ");
        b = input.nextDouble();

        System.out.print("Digite o lado C: ");
        c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("É um triângulo.");

            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }
        } else {
            System.out.println("Os lados informados NÃO formam um triângulo.");
        }

        input.close();
    }
}