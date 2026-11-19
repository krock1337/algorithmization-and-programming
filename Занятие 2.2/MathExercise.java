
import java.util.Scanner;

public class MathExercise {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите x: ");
            double x = scanner.nextDouble();

            System.out.print("Введите y: ");
            double y = scanner.nextDouble();

            System.out.print("Введите z: ");
            double z = scanner.nextDouble();

            double result1 = (x + y) * (z - 2) / (x + 1) + y * z;
            double result2 = (x * x + y * y) / (z + 1) - (x * y) / (z - 2);
            double result3 = (x + y + z) * (x - y) / (z + 1) + x * y - z;

            System.out.println("Алгебраические выражения:");

            System.out.printf("(%1$.1f + %2$.1f) * (%3$.1f - 2) / (%1$.1f + 1) + %2$.1f * %3$.1f = %4$.4f\n",
                    x, y, z, result1);

            System.out.printf("(%1$.1f² + %2$.1f²) / (%3$.1f + 1) - (%1$.1f * %2$.1f) / (%3$.1f - 2) = %4$.4f\n",
                    x, y, z, result2);

            System.out.printf("(%1$.1f + %2$.1f + %3$.1f) * (%1$.1f - %2$.1f) / (%3$.1f + 1) + %1$.1f * %2$.1f - %3$.1f = %4$.4f\n",
                    x, y, z, result3);

            double result4 = Math.sqrt(Math.abs(Math.pow(x, 3) + Math.cos(x)));

            double result5 = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(y), 2);
            double result6 = (Math.sqrt(Math.abs(Math.pow(x, 2) - Math.pow(y, 2)))
                    + Math.log(Math.abs(z) + 1)) / (Math.abs(Math.sin(x)) + 1);

            System.out.println("Выражения с использованием Math:");

            System.out.printf("√|%1$.1f³ + cos(%1$.1f)| = %2$.4f%n",
                    x, result4);

            System.out.printf("sin²(%1$.1f) + cos²(%2$.1f) = %3$.4f%n",
                    x, y, result5);

            System.out.printf("6. (√|%1$.1f² - %2$.1f²| + ln(|%3$.1f| + 1)) / (|sin(%1$.1f)| + 1) = %4$.4f%n",
                    x, y, z, result6);

        }
    }
}