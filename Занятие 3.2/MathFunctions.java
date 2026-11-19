import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите x: ");
            double x = scanner.nextDouble();

            try{
                double resultTask4 = calculateTask4(x);
                System.out.println("Задача 4.");
                System.out.println("Результат: " + resultTask4);
            }catch (IllegalArgumentException e){
                System.out.println("Задача 4.");
                System.out.println("Результат: " + e.getMessage());
            }

            double resultTask5 = calculateTask5(x);
            System.out.println("Задача 5.");
            System.out.println("Результат: " + resultTask5);

            double resultTask14 = calculateTask14(x);
            System.out.println("Задача 14.");
            System.out.println("Результат: " + resultTask14);

            try{
                double resultTask15 = calculateTask15(x);
                System.out.println("Задача 15.");
                System.out.println("Результат: " + resultTask15);
            }catch (IllegalArgumentException e){
                System.out.println("Задача 15.");
                System.out.println("Результат: " + e.getMessage());
            }
        }
    }

    public static double calculateTask4(double x){
        if (x >= 1 && x <= 3){
            return 2 * Math.pow(x, 2) - 3 * Math.exp(Math.sin(x));
        }else if (x > 3){
            return 3 * Math.tan(x);
        }else {
            throw new IllegalArgumentException("Нет решения");
        }
    }

    public static double calculateTask5(double x){
        if (x > 1) {
            return Math.log(2 * x) + Math.sqrt(1 + Math.pow(x, 2));
        }

        return 2 * Math.cos(x) + 3 * Math.pow(x, 2);
    }

    public static double calculateTask14(double x){
        if (x > 2) {
            return x * Math.cbrt(x - 2);
        } else if (x == 2) {
            return x * Math.sin(2 * x);
        } else {
            return Math.exp(-2 * x) * Math.cos(2 * x);
        }
    }

    public static double calculateTask15(double x){
        // Проверка на x > 0 необходима, потому что Math.log() определен при положительном аргументе,
        // а Math.sqrt() при неотрицательном подкоренном выражении.
        if (x < 0.5 && x > 0) {
            double numerator = Math.pow(Math.log(x), 3) + Math.pow(x, 2);
            double denominator = Math.sqrt(x + 2);
            return numerator / denominator;
        } else if (x > 0.5) {
            return Math.cos(x) + 2 * Math.pow(Math.sin(x), 2);
        } else {
            throw new IllegalArgumentException("Нет решения");
        }
    }
}
