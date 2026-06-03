import java.util.Scanner;

public class PrintIntegerVariable {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer num = scanner.nextInt();

    System.out.printf("Pennsylvania Avenue, %d\n", num);
    scanner.close();
  }
}
