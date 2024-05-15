public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x != 13) {
            while (y != 10) {
                System.out.print(x * y + " ");
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}