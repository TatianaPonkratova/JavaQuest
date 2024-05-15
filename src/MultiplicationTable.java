public class MultiplicationTable {
    public static void main(String[] args) {
        int x = 1;
        while (x != 13) {
            for (int i = 1; i < 10; i++) {
                int z = i * x;
                System.out.print(z + " ");
            }
            System.out.println();
            x++;
        }
    }
}

