import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest {

    public static void main(String[] args) {
        PartOne partOne = new PartOne();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, друг! Как насчёт того, чтобы немного поиграть? \n Как тебя зовут?");
        String nameGamer = scanner.nextLine();
        System.out.println("Привет, " + nameGamer + ", я Том) сколько тебе лет?");
        int ageGamer = partOne.validateInput();
        System.out.println("круто, уже " + ageGamer + ". А сможешь угадать мой возраст? Как думаешь, сколько мне?");

        boolean ageTomRandom = partOne.enterAgeTomRandom();

        partOne.enterAgeTomRight(ageTomRandom);

        System.out.println("Видишь эти входы в пещеру?\n" + "У первого стоит лев, пройти будет сложнее, но я дам тебе " +
                "30 миллионов денег, если ты выберешь первый вход,\n" +
                " два других свободны. Под каким номером выберешь вход?");
        partOne.numberDoor();

        System.out.println("Ого! Ты видишь эти мосты над пропастью? " +
                "\n Между нами - я вообще не думал, что внутри пещер бывают пропасти!" +
                "\n Похоже, нам снова пидётся выбирать! Правая надёжная и асфальтовая дорога, но, отсюда вижу " +
                "- она платная( " +
                "\n Придётся выложить 15 миллионов денег((" +
                "\n Зато левая свободная и открытая, но на этом хлипком подвесном мосту не хватает доски..., " +
                "и не перепрыгнуть ведь! " +
                "\n" + nameGamer + ", ты готов разобраться с доской или заплатишь? Если нечем - можем вернуться ко льву" +
                "\n Итак, выбираем левую или правую?");
        String wayLeftOrRight = partOne.wayLeftOrRight();
        partOne.owl(wayLeftOrRight);
    }

}



