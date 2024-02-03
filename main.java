import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();

        double a = 7.1;
        double b = 1.8;
        double y = Math.cos(a * x) + b;

        System.out.println("y = " + y);
        scanner.close();
    }
}
