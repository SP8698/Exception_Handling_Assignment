package uniqueExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        uncheckedException.divideNumbers();
    }
}