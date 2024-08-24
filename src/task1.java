import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = scanner.nextDouble();

        System.out.println("Enter B:");
        double b = scanner.nextDouble();

        double res = a + ((a+b-1)/(Math.pow(a, 2) + 2)) - Math.pow(a*b, 3);

        System.out.println(res);

    }
}
