import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Привет! Давай познакомимся.");

            System.out.print("Как тебя зовут? ");
            String name = scanner.nextLine();

            System.out.print("Сколько тебе лет? ");
            int age = scanner.nextInt();

            System.out.print("Какой у тебя рост? ");
            int height = scanner.nextInt();

            System.out.println("Приятно познакомиться, " + name + "!");
            System.out.println("Тебе " + age + " лет.");
            System.out.println("Твой рост - " + height + " см.");
        }
    }
}