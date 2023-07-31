package programation.personal.redoexam.newpackage1;

import java.util.Scanner;

public class Serie {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int a = 1;
        for (int i = 1; i < x; i++) {
            System.out.print((a) + " ");
            a += 2;
            if (a / i == 0) {
                a = a + i;
            }
        }
    }
}
