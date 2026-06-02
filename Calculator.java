import java.util.InputMismatchException;
import java.util.Scanner;

// Exception for divide by zero
class CannotDivideByZeroException extends Exception {

    @Override
    public String getMessage() {
        return "You cannot divide by zero!";
    }
}

// Exception for large input
class MaxInputException extends Exception {

    @Override
    public String getMessage() {
        return "Input cannot be greater than 100000.";
    }
}

public class Calculator {

    // Validation method
    public static void checkInput(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
    }

    // Addition
    public static double add(double a, double b)
            throws MaxInputException {

        checkInput(a, b);
        return a + b;
    }

    // Subtraction
    public static double sub(double a, double b) throws MaxInputException {
        checkInput(a, b);
        return a - b;
    }

    // Multiplication
    public static double multi(double a, double b) throws MaxInputException {
        checkInput(a, b);
        return a * b;
    }

    // Division
    public static double div(double a, double b) throws MaxInputException, CannotDivideByZeroException {
        checkInput(a, b);
        if (b == 0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== Welcome to My Calculator ==========");

        while (true) {

            System.out.println("\nChoice 1 : Addition");
            System.out.println("Choice 2 : Subtraction");
            System.out.println("Choice 3 : Multiplication");
            System.out.println("Choice 4 : Division");
            System.out.println("Choice 5 : Exit");

            try {

                System.out.print("Please enter your choice : ");
                int choice = sc.nextInt();

                if (choice == 5) {
                    System.out.println("Thanks for using my calculator!");
                    break;
                }

                System.out.print("Please enter first number : ");
                double a = sc.nextDouble();

                System.out.print("Please enter second number : ");
                double b = sc.nextDouble();

                double result;

                switch (choice) {

                    case 1:
                        result = add(a, b);
                        System.out.println("Sum is : " + result);
                        break;

                    case 2:
                        result = sub(a, b);
                        System.out.println("Difference is : " + result);
                        break;

                    case 3:
                        result = multi(a, b);
                        System.out.println("Multiplication is : " + result);
                        break;

                    case 4:
                        result = div(a, b);
                        System.out.println("Division is : " + result);
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Please enter numbers only.");
                sc.nextLine();

            } catch (CannotDivideByZeroException | MaxInputException e) {
                System.out.println("Exception : " + e.getMessage());
            }
        }

        sc.close();
    }
}

