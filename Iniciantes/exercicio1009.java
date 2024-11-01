import java.io.IOException;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine(); // Lê o nome (se necessário para o problema)
        double salario = scanner.nextDouble(); // Lê o salário
        double vendas = scanner.nextDouble(); // Lê as vendas

        double TOTAL = (vendas * 15) / 100 + salario;

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

        scanner.close();
    }



}