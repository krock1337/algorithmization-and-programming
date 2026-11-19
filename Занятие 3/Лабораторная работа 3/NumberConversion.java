import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите значение, которое хотите перевести: ");

            // nextDouble не считывает перенос строки, поэтому читаем через nextLine
            double value = Double.parseDouble(scanner.nextLine());

            System.out.print("""
                    Выберите вариант перевода:
                    1. Метры -> сантиметры
                    2. Килограммы -> граммы
                    3. Часы -> минуты
                    4. Байты -> килобайты
                    """);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> System.out.printf("%.2f м = %.2f см%n", value, value * 100);
                case "2" -> System.out.printf("%.2f кг = %.2f г%n", value, value * 1000);
                case "3" -> System.out.printf("%.2f ч = %.2f мин%n", value, value * 60);
                case "4" -> System.out.printf("%.2f байт = %.2f КБ%n", value, value / 1024);

                default -> System.out.println("Неизвестная операция.");
            }

        }
    }
}