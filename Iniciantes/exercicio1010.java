import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

  Scanner scanner = new Scanner(System.in);
      int codigoPeca1 = scanner.nextInt();
      int numeroPeca1 = scanner.nextInt();
      double valorPeca1 = scanner.nextDouble();
         int codigoPeca2 = scanner.nextInt();
      int numeroPeca2 = scanner.nextInt();
      double valorPeca2 = scanner.nextDouble();
      double TOTAL = numeroPeca1*valorPeca1 + numeroPeca2*valorPeca2;
   System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);
  scanner.close();
    }

}