public class ForWhileDoWhile {
    public static void main(String[] args) {
        System.out.println("for loop:");
        for (int i = 0; i < 5; i++) System.out.print(i + " ");
        System.out.println();

        System.out.println("while loop:");
        int j = 0;
        while (j < 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        System.out.println("do-while loop:");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5);
        System.out.println();
    }
}