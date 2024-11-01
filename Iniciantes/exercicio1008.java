import java.io.IOException;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
     int NUMBER = scanner.nextInt();
     int HOURS = scanner.nextInt();
     double MONEY = scanner.nextDouble();
     double SALARY = HOURS * MONEY;
System.out.printf("NUMBER = %d%n", NUMBER);
     System.out.printf("SALARY = U$ %.2f%n", SALARY);
    scanner.close();


    }

}