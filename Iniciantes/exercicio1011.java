import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner scanner= new Scanner(System.in);
      final double PI = 3.14159;

    Double raio = scanner.nextDouble();
    Double raioAoCubo = Math.pow(raio, 3);
    Double volume = (4.0/3)* PI * raioAoCubo;
    System.out.printf("VOLUME = %.3f%n",volume);
    scanner.close();
    }

}