package programation.personal.redoexam.newpackage1;

import java.util.Scanner;

public class Figure {

    public static String show() {
        int x = 5;
        int aux = x;
        int aux1;
        for (int i = 1; i <= x; i++) {
            aux1 = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k < aux + (aux - 1); k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(aux1);
                aux1--;
            }
            System.out.println("");
            aux--;
        }
        return "";
    }

    public static void main(String[] args) {
        show();
    }
}
