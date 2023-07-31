package programation.personal;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        int counter = 1;
        long quantity = 1, info = 1;
        Scanner reader = new Scanner(System.in);
        String data = reader.nextLine();
        String change[] = data.split(" ");

        int allData[] = new int[Integer.parseInt(change[0]) - 1];
        for (int i = 0; i < allData.length; i++) {
            allData[i] = Integer.parseInt(change[counter]);
            counter++;
        }
        for (int i = 1; i <= allData.length + 1; i++) {
            quantity *= i;
        }
        for (int i = 0; i < allData.length; i++) {
            info *= allData[i];
        }
        System.out.println(quantity / info);
    }
    /* int counter = 1, counter1 = 1;

        Scanner reader = new Scanner(System.in);
        String data = reader.nextLine();
        String change[] = data.split(" ");

        int allData[] = new int[Integer.parseInt(change[0]) - 1];
        for (int i = 0; i < allData.length; i++) {
            allData[i] = Integer.parseInt(change[counter]);
            counter++;
        }
        Arrays.sort(allData);
        for (int i = 0; i < allData.length; i++) {
            if (allData[i] != counter1) {
                System.out.println(counter1);
                break;
            }
            counter1++;

        }*/
}
