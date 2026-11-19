import java.util.Scanner;

public class TaskManagerChat {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("""
                    -----------------------------------------------------
                       ДОБРО ПОЖАЛОВАТЬ В СИСТЕМУ УПРАВЛЕНИЯ ЗАДАЧАМИ!
                    -----------------------------------------------------
                    
                    Task Manager — система управления задачами,
                    которая помогает организовывать повседневные
                    дела, планировать и следить за выполнением целей.
                    
                    Давайте познакомимся!
                    """);

            System.out.print("Как вас зовут? ");
            String name = scanner.nextLine();

            System.out.print("Сколько задач вы планируете выполнять ежедневно? ");
            int taskCount = Integer.parseInt(scanner.nextLine());

            System.out.print("Сколько часов в день вы обычно работаете? ");
            int workingHours = Integer.parseInt(scanner.nextLine());

            System.out.print("Как вы предпочитаете организовывать задачи: по приоритету или по срокам? ");
            String organizationType = scanner.nextLine();

            System.out.print("Часто ли вы забываете о запланированных делах? (true/false): ");
            boolean forgetTasks = Boolean.parseBoolean(scanner.nextLine());

            System.out.print("Какой приоритет вы чаще используете (H/M/L)? ");
            char priority = scanner.nextLine().charAt(0);

            System.out.print("Сколько задач вам обычно удается завершить за день? ");
            int dailyCompletedTaskCount = Integer.parseInt(scanner.nextLine());

            System.out.print("Хотели бы вы получать напоминания о приближающихся дедлайнах? (true/false): ");
            boolean reminders = Boolean.parseBoolean(scanner.nextLine());

            System.out.print("Какую главную цель вы хотите достичь с помощью Task Manager? ");
            String goal = scanner.nextLine();

            System.out.printf("""
                            
                            ==========================================
                                     ВАШИ РЕЗУЛЬТАТЫ
                            ==========================================
                            
                            Пользователь: %s
                            Кол-во задач на ежедневное выполнение: %d
                            Рабочее время: %dч
                            Способ организации: %s
                            Забываете о делах: %b
                            Предпочитаемый приоритет: %c
                            Кол-во завершенных задач за день: %d
                            Присылать напоминания: %b
                            Главная цель: %s
                            
                            Спасибо за ответы, %1$s!
                            ==========================================
                            """,
                    name, taskCount, workingHours, organizationType, forgetTasks,
                    priority, dailyCompletedTaskCount, reminders, goal);

        }
    }
}