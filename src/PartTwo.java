import java.util.Scanner;

public class PartTwo extends PartOne{
    public void screem() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext("[а-я]+")) {
            System.out.println("Да погромче, она ж не услышит!");
            screem();
        }
        scanner.next(); //что это?
        System.out.println("Чего кричишь? Я сразу услышала, я просто медленно летаю. Ты вообще знаешь," +
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


    public void owl(String way) {
        Scanner scanner = new Scanner(System.in);
        if (way.equals("левую")) {
            screem();
        }
    }

    public void axeRiddle() {
        Scanner scanner = new Scanner(System.in);
        String axe = scanner.nextLine();
        if (axe.equals("Топор")) {
            System.out.println("Фух, молодец, что быстро ответил. Я устала( держи доску и проходи, а я полетела!");
        } else {
            System.out.println("Нет, ты что-то путаешь, давай хоть немного подумай");
            axeRiddle();
        }
    }

    public void snake() {
        Scanner scanner = new Scanner(System.in);
        String snake = scanner.nextLine();
        if (snake.equals("Голубая")) {
            blueSnake();
        } else if (snake.equals("Жёлтая")) {
            yellowSnake();
        }
    }

    public void blueSnake() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Штошшшшшшшшш...Вы сделали правильный выбор, я тоже думаю, что голубой куда благородней.." +
                "\n Итак..господа, найдётся 10 миллионов денег? ");
        if (money >= 10) {
            System.out.println("Вижу, вижу... сейчас сброшу лесницу! Быстрее поднимайтесь, внутри как-то неспокойно," +
                    "\n только бы не эти летучие мыши снова...");
        } else {
            System.out.println("Даже из большой любви к посетителям скидок я не представляю..." +
                    "\n так что попытайте счастье у Матильды...хах..или вернётесь ко льву? " +
                    "\n Лев или Матильда?");
            snakeOrLion();
        }
    }
    public void yellowSnake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ребята, привет! Как ваши дела? Меня зовут Матильда, я королевская змейка, как и моя сестра Лора" +
                "\n Вообще мама говорила, что мы близняшки, хотя откуда у нас разный цвет...+" +
                "\n ой, заболталась! Я тут снова изучаю теорию вероятностей, необычайно занимательно, должна вас сказать!" +
                "\n скажите, пожалуйста, подумав, какое моё любимое число? 8, 13 или 22? Осторожно, у вас всего одна попытка" +
                "\n или вам придётся начать всё заново!");
        favoriteNumberOfSnake();
    }


    public void  favoriteNumberOfSnake() {
        Scanner scanner = new Scanner(System.in);
        Integer favoriteNumberOfSnake = scanner.nextInt();
        if (favoriteNumberOfSnake == 22) {
            System.out.println("Воооооооооу, как ты догадался?!! Да, шикарное число 22 всегда напоминало мне себя и Лору - " +
                    "\n такие же стройные и одинаковые цифры..." +
                    "\n ох... опять я расчувствовалась, ползу за лестницей!" +
                    "\n  надеюсь, ещё увидимся, ребята!");
        } else if ((favoriteNumberOfSnake == 8) || (favoriteNumberOfSnake == 13)) {
            System.out.println("Ребята...логика или хотя бы интуиция - не ваше:(" +
                    "\n мне жаль, но вам придётся вернуться в самое начало...");
        } else {
            System.out.println("Ээээ, вы вопрос поняли? 8, 13 или 22?");
            favoriteNumberOfSnake();
        }
    }
    public void snakeOrLion() {
        Scanner scanner = new Scanner(System.in);
        String snakeOrLion = scanner.nextLine();
        if (snakeOrLion.equals("Лев")) {
            System.out.println("Пссс, я пошутил, ахахах, вы время видели? Он давно домой ушёл! Целый прайд полдня без хозяина!" +
                    "\n Скажите спасибо, что я добрая, так бы зря бегали." +
                    "\n Отправляйтесь к Матильде, она - не я, - вас не обидит! ха-ха-ха!");
        } else if (snakeOrLion.equals("Матильда")) {
            System.out.println("Сразу правильное решение" +
                    "\n Отправляйтесь к Матильде, она - не я, - вас не обидит! ха-ха-ха!");
        } else {
            System.out.println("Совсем не разберу, что ты сказал... повтори..Лев или Матильда?");
            snakeOrLion();
        }
    }
}
