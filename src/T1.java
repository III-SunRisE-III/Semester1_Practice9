import java.util.Scanner;

public class T1 {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == b) return a;
        if (a == 0 || b == 0) return a + b;

        if (a > b) a = a % b;
        else b = b % a;

        return gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("\nЧислитель: ");
            int numerator = s.nextInt();
            System.out.print("Знаменатель: ");
            int denominator = s.nextInt();
            if (denominator == 0) {
                System.out.println("Знаменатель не может быть равен нулю.");
                continue;
            }

            int divider = gcd(numerator, denominator);
            numerator /= divider;
            denominator /= divider;

            if (numerator == 0) {
                System.out.println("Сокращённая дробь: 0");
                continue;
            }
            if (denominator == 1) {
                System.out.println("Сокращённая дробь: " + numerator);
                continue;
            }
            if (denominator == -1) {
                System.out.println("Сокращённая дробь: " + -numerator);
                continue;
            }
            if (((float)numerator / denominator) > 0) {
                System.out.println("Сокращённая дробь: " + Math.abs(numerator) + "/" + Math.abs(denominator));
            } else {
                System.out.println("Сокращённая дробь: " + -Math.abs(numerator) + "/" + Math.abs(denominator));
            }
        } while (true);
    }
}
