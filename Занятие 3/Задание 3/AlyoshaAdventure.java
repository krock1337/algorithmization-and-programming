import java.util.Scanner;

public class AlyoshaAdventure {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Алёша Попович отправился в путешествие и вскоре увидел путеводный камень.");
            System.out.println("На камне написано:");
            System.out.println("Направо пойдёшь — женатым будешь, налево пойдёшь — богатым будешь, а кто прямо пойдёт, тот смерть свою сыщет.");

            System.out.println("Выбери, куда пойдёшь: направо / налево / прямо / останешься");
            String stone = scanner.nextLine().toLowerCase();

            if (stone.equals("направо")) {
                System.out.println("Алёша отправился направо и увидел большое озеро.");
                System.out.println("Перед ним два пути:");

                System.out.println("1. Переплыть озеро.");
                System.out.println("2. Перейти по мосту.");
                String lake = scanner.nextLine();

                if (lake.equals("1")) {
                    System.out.println("Алёша переплыл озеро и встретил русалку.");

                    System.out.println("1. Предложить русалке руку и сердце.");
                    System.out.println("2. Попрощаться и продолжить путешествие.");

                    int mermaid = Integer.parseInt(scanner.nextLine());

                    if (mermaid == 1) {
                        System.out.println("Алёша женился на русалке и обрёл семейное счастье!");
                    } else if (mermaid == 2) {
                        System.out.println("Русалка отпустила Алёшу, и он продолжил свой путь.");
                    } else {
                        System.out.println("Алёша не смог определиться и уплыл обратно.");
                    }

                } else if (lake.equals("2")) {
                    System.out.println("Алёша пошёл по мосту, но тот обвалился!");
                    System.out.println("Он оказался на берегу рядом с домом троллихи.");

                    System.out.println("1. Постучать в дверь.");
                    System.out.println("2. Попытаться незаметно уйти.");

                    String troll = scanner.nextLine();

                    if (troll.equals("1")) {
                        System.out.println("Троллиха открыла дверь и предложила Алёше жениться на ней.");
                    } else if (troll.equals("2")) {
                        System.out.println("Алёша незаметно сбежал и продолжил путешествие.");
                    } else {
                        System.out.println("Алёша замешкался, и троллиха сама вышла ему навстречу.");
                    }

                } else {
                    System.out.println("Алёша не смог выбрать путь и вернулся к камню.");
                }

            } else if (stone.equals("налево")) {
                System.out.println("Алёша отправился налево и нашёл сундук с золотом.");

                System.out.println("1. Забрать всё золото.");
                System.out.println("2. Оставить часть золота другим путникам.");

                String gold = scanner.nextLine();

                if (gold.equals("1")) {
                    System.out.println("Алёша забрал всё золото и стал очень богатым!");

                    System.out.println("1. Построить себе дворец.");
                    System.out.println("2. Купить большую армию.");

                    String wealth = scanner.nextLine();

                    if (wealth.equals("1")) {
                        System.out.println("Алёша построил огромный дворец и стал жить в роскоши!");
                    } else if (wealth.equals("2")) {
                        System.out.println("Алёша собрал армию и стал великим воеводой!");
                    } else {
                        System.out.println("Алёша решил сохранить своё богатство.");
                    }

                } else if (gold.equals("2")) {
                    System.out.println("Алёша поделился золотом с бедными путниками.");
                    System.out.println("Люди отблагодарили его и подарили волшебный меч.");

                } else {
                    System.out.println("Алёша не смог определиться и оставил сундук на месте.");
                }

            } else if (stone.equals("прямо")) {
                System.out.println("Алёша пошёл прямо и встретил страшного змея.");

                System.out.println("1. Сразиться со змеем.");
                System.out.println("2. Попытаться убежать.");

                String dragon = scanner.nextLine();

                if (dragon.equals("1")) {
                    System.out.println("Алёша достал меч.");

                    System.out.println("1. Атаковать змея.");
                    System.out.println("2. Защититься щитом.");

                    String fight = scanner.nextLine();

                    if (fight.equals("1")) {
                        System.out.println("Алёша победил змея и стал настоящим героем!");
                    } else if (fight.equals("2")) {
                        System.out.println("Змей выдохнул огонь, и Алёша не смог спастись.");
                    } else {
                        System.out.println("Алёша растерялся, и змей одержал победу.");
                    }

                } else if (dragon.equals("2")) {
                    System.out.println("Алёша попытался убежать, но змей догнал его.");
                    System.out.println("Алёша погиб.");

                } else {
                    System.out.println("Алёша испугался и спрятался за камнем.");
                }

            } else if (stone.equals("останешься")) {
                System.out.println("Алёша решил остаться возле камня.");
                System.out.println("Через некоторое время он проголодался.");

                System.out.println("1. Отправиться искать еду.");
                System.out.println("2. Остаться и ждать помощи.");

                String stay = scanner.nextLine();

                if (stay.equals("1")) {
                    System.out.println("Алёша нашёл избушку с едой.");

                    System.out.println("1. Постучать и попросить еды.");
                    System.out.println("2. Попытаться найти еду самостоятельно.");

                    String food = scanner.nextLine();

                    if (food.equals("1")) {
                        System.out.println("Хозяева избушки накормили Алёшу и приютили его!");
                    } else if (food.equals("2")) {
                        System.out.println("Алёша нашёл ягоды и утолил голод.");
                    } else {
                        System.out.println("Алёша не решился войти в лес и вернулся к камню.");
                    }

                } else if (stay.equals("2")) {
                    System.out.println("К вечеру мимо проходил добрый путник.");
                    System.out.println("Он предложил Алёше отправиться вместе с ним.");

                } else {
                    System.out.println("Алёша продолжил сидеть возле камня.");
                }

            } else {
                System.out.println("Такого направления нет. Алёша остался возле камня.");
            }

            System.out.println("Конец истории!");

        }
    }
}