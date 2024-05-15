public class WithoutRemainder {
    public static void main(String[] args) {
        int x = 2;
        while (x != 11) {
            for (int i = 10; i < 100; i++) {
                if (i % x == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            x++;
        }
    }
}
