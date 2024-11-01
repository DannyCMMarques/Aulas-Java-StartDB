import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final double n = 3.14159;

        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double A = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", A);
        scanner.close();
    }
}