package programation.personal;

import java.util.Scanner;

public class Series {

    public static Scanner reader = new Scanner(System.in);

    public void first(int quantity) {

        for (int i = 0; i < quantity; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + ",");
                if (j == 5) {
                    System.out.print("2,");
                }
            }
        }
        System.out.println("...");
    }

    public void second(int quantity) {
        for (int i = 1; i <= quantity; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + ",");
            }

        }
        System.out.println("...");
    }

    public static void main(String[] args) {
        Series information = new Series();
        int data = 0;
        data = reader.nextInt();
        information.first(data);
        information.second(data);

    }
}
