import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two integers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}