import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double a = in.nextDouble();
    System.out.print("Enter operator (+,-,*,/): ");
    char op = in.next().charAt(0);
    System.out.print("Enter second number: ");
    double b = in.nextDouble();

    double res = 0;
    switch (op) {
      case '+': res = a + b; break;
      case '-': res = a - b; break;
      case '*': res = a * b; break;
      case '/':
        if (b != 0) res = a / b;
        else System.out.println("Cannot divide by zero");
        break;
      default: System.out.println("Unknown operator");
    }

    System.out.println("Result: " + res);
    in.close();
  }
}
