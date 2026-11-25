import java.util.Random;
import java.util.Scanner;

public class Roshambo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("""
                    Выберите:
                    1. Камень
                    2. Ножницы
                    3. Бумага
                    """);
            int userChoice = scanner.nextInt();

            Random random = new Random();
            int computerChoice = random.nextInt(1, 4);

            String user;
            String computer = "";

            switch (userChoice) {
                case 1 -> user = "Камень";
                case 2 -> user = "Ножницы";
                case 3 -> user = "Бумага";

                default -> {
                    System.out.println("Некорректный выбор!");
                    return;
                }
            }

            switch (computerChoice) {
                case 1 -> computer = "Камень";
                case 2 -> computer = "Ножницы";
                case 3 -> computer = "Бумага";
            }

            System.out.println("Ваш выбор: " + user);
            System.out.println("Выбор компьютера: " + computer);

            switch (userChoice) {
                case 1 -> {
                    switch (computerChoice) {
                        case 1 -> System.out.println("Ничья!");
                        case 2 -> System.out.println("Вы победили!");
                        case 3 -> System.out.println("Вы проиграли!");
                    }
                }
                case 2 -> {
                    switch (computerChoice) {
                        case 1 -> System.out.println("Вы проиграли!");
                        case 2 -> System.out.println("Ничья!");
                        case 3 -> System.out.println("Вы победили!");
                    }
                }
                case 3 -> {
                    switch (computerChoice) {
                        case 1 -> System.out.println("Вы победили!");
                        case 2 -> System.out.println("Вы проиграли!");
                        case 3 -> System.out.println("Ничья!");
                    }
                }
            }
        }
    }
}
