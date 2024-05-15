import java.util.InputMismatchException;
import java.util.Scanner;

public class PartOne {
    int money = 0;
    public  int validateInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Мне кажется, ты ошибся. Повтори, пожалуйста");
        }
        return validateInput();
    }

    public  void enterAgeTomRight(boolean ageTomRandom) {
        if (ageTomRandom) {
            System.out.println("Ого! Как это у тебя получилось угадать?! Круто! Поехали дальше) ");
        } else {
            Scanner scanner = new Scanner(System.in);
            int ageTomRight = scanner.nextInt();
            if (ageTomRight == 20) {
                System.out.println("Вау, ты крут! И совершенно прав! Поехали дальше) ");
            } else {
                System.out.println("Мммм, нет, я так не думаю( прикинешь ещё?");
                enterAgeTomRight(false);
            }
        }
    }

    public  boolean enterAgeTomRandom() {
        Scanner scanner = new Scanner(System.in);
        int ageTomRandom = scanner.nextInt();
        if (ageTomRandom != 20) {
            System.out.println("Хм, ты думаешь? Я действительно произвожу такое впечатление? хаха, шучу) не всё так просто." +
                    " \n я намекну тебе: \n если бы ты вернулся в 2007, то подсказка -32222377726669- здорово бы тебе помогла) " +
                    "\n так сколько мне? давай просто цифру");
            return false;
        } else {
            return true;
        }
    }

    public  void numberDoor() {
        Scanner scanner = new Scanner(System.in);
        int numberDoor = scanner.nextInt();
        if (numberDoor == 1) {
            System.out.println("Воу! Ты смелый парень! Придётся отгадать загадку льва: \n Меня никогда не было, " +
                    "\n Меня все ожидают, \n Меня никто не видел и не увидит, \n И всё же на меня полагаются все, " +
                    "кто живёт и дышит. \n Так кто же я? ");
            lionRiddle();
        } else if ((numberDoor == 2) || (numberDoor == 3)) {
            System.out.println("Тоже вариант! Зачем усложнять? Заходим!");
        } else {
            System.out.println("Подожди, ты уверен?.. Что-то я такой двери не наблюдаю.. Ещё раз: какая дверь?");
            numberDoor();
        }
    }

    public  void lionRiddle() {
        Scanner scanner = new Scanner(System.in);
        String tomorrow = scanner.nextLine();
        if (tomorrow.equals("Завтра")) {
            System.out.println("Вот это уровень! Я, признаюсь, догадался лишь с третьего раза( \" " +
                    "\n + Теперь карманы тебе оттягивают 30 миллионов денег))" +
                    "\n Неважно! Шагаем вглубь пещеры!");
                money = money + 30;
        } else {
            System.out.println("Ох, нет. Давай ещё разок!");
            lionRiddle();
        }
    }

    public  String wayLeftOrRight() {
        Scanner scanner = new Scanner(System.in);
        String way = scanner.nextLine();
        if (way.equals("Правую")) {
//            if
            System.out.println("Пробегай, я за тобой! Но помни, у тебя теперь вдвое меньше монет(");
        } else if (way.equals("Левую")) {
            System.out.println("Отважный выбор. Чтож.. где же раздобыть доску? " +
                    "\n" +
                    "\n Слууушай. А вот эта странная огромная сова, что это у неё в лапах?" +
                    "\n Да, точно, доска! Интересно, зачем ей потребовалось дербанить мост?.." +
                    " Может тоже заработать планирует?" +
                    "\n Можешь покричать ей, чтоб подлетела?");
        } else {
            System.out.println("Стоп-стоп-стоп! Что ты говоришь, не разберу... Правую или Левую? ну или я чего-то не знаю, и ты умеешь летать?");
            wayLeftOrRight();
        }
        return way;
    }


    public  void owl(String way) {
        Scanner scanner = new Scanner(System.in);
        if (way.equals("Левую")) {
            String screem = scanner.nextLine();
            if (3 > 2) { //нижний регистр
                System.out.println("Нет, ну тихо же( Громче можно?");
            } else {
                System.out.println("Чего кричишь? Я с первого раза услышала, я просто медленно летаю. Ты вообще знаешь," +
                        "\n сколько мне лет? Разорался! да и доска тяжёлая!" +
                        "\n" +
                        "\n Уф! Привет! Я начитанная сова! Если честно,..устала я уже её таскать(" +
                        "\n ответишь на мой любимый вопрос, и брошу тебе доску. Или будешь пробовать перепрыгнуть? Шучу " +
                        "\n" +
                        "\n Итак..Один известный писатель любил пословицу о двух предметах." +
                        "\n В итоге написал великое произведение первым, а второй оказался злополучным гвоздём книги. " +
                        "\n Что за второй предмет?");
                axeRiddle();
            }
        }
    }

    public  void axeRiddle() {
        Scanner scanner = new Scanner(System.in);
        String axe = scanner.nextLine();
        if (axe.equals("Топор")) {
            System.out.println("Фух, молодец, что быстро ответил. Я устала( держи доску и проходи, а я полетела!");
        } else {
            System.out.println("Нет, ты что-то путаешь, давай хоть немного подумай");
            axeRiddle();
        }
    }
}
