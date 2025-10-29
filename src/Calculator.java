import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please assign two numbers for calculator : ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        // Bir satır atlamak için:
        scan.nextLine(); // Ayrıca bu satır scan objesini yeniden string bir karakter girebilmek için lazımdı burda scan.nextLine(); diyerek oluşturtuk.

        System.out.println("Please choose the operation (addition, subtraction, multiplication, division): ");
        String process = scan.nextLine(); // sonra onu burda kullandık.

        if (process.equalsIgnoreCase("addition")) {
            System.out.println("Your numbers are: " + n1 + " and " + n2 + ". And the result is: " + addition(n1, n2));
        } else if (process.equalsIgnoreCase("subtraction")) {
            System.out.println("Your numbers are: " + n1 + " and " + n2 + ". And the result is: " + subtraction(n1, n2));
        } else if (process.equalsIgnoreCase("multiplication")) {
            System.out.println("Your numbers are: " + n1 + " and " + n2 + ". And the result is: " + multiplication(n1, n2));
        } else if (process.equalsIgnoreCase("division")) {
            if (n2 == 0) {
                System.out.println("Error: Division by zero is not allowed!");
            } else {
                System.out.println("Your numbers are: " + n1 + " and " + n2 + ". And the result is: " + division(n1, n2));
            }
        } else {
            System.out.println("Invalid operation. Please choose addition, subtraction, multiplication or division.");
        }

        scan.close();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return (double) num1 / num2; // double cast önemli yoksa sadece tam kısmını gösteren bir işlem olur bize küsürü de lazım
    }


}
