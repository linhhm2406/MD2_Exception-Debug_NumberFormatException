import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public void cal(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tong : " + a);
            System.out.println("Hieu : " + b);
            System.out.println("Tich : " + c);
            System.out.println("Thuong : " + d);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        CalculationExample calculationExample = new CalculationExample();

        try {
            System.out.println("Nhap x : ");
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.fillInStackTrace());
        }
        try {
        System.out.println("Nhap y : ");
        scanner.nextLine();
        y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.fillInStackTrace());
        }
        calculationExample.cal(x, y);
    }
}
