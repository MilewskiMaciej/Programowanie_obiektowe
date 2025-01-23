import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Podaj pierwszą liczbę (licznik): ");
                int numerator = scanner.nextInt();
                System.out.println("Podaj drugą liczbę (mianownik): ");
                int denominator = scanner.nextInt();
                int result = numerator / denominator;
                System.out.println("Wynik dzielenia: " + result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Nie można dzielić przez zero.");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Podano nieprawidłowe dane");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
