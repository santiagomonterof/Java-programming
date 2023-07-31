package programation.practice00;

import java.util.Scanner;

public class WastingTime {

    Scanner reader = new Scanner(System.in);
    public static String data1, data2;
    public static boolean flag = true;

    public boolean exit(String data) {

        if (data.equals("-1 -1")) {
            flag = false;
        }
        return flag;
    }

    public void information() {
        while (flag == true) {
            try {
                long minutes = 0, change = 0, firstPart = 0, lastPart = 0, less;
                data1 = reader.nextLine();
                if (exit(data1) == false) {
                    break;
                }
                data2 = reader.nextLine();
                if (exit(data2) == false) {
                    break;
                }

                String info[] = data1.split(" ");
                String chapers[] = data2.split(" ");
                less = chapers.length;
                for (int i = 0; i < chapers.length; i++) {
                    minutes = Integer.parseInt(info[1]);
                    change = Integer.parseInt(chapers[i]);
                    firstPart = change * less;
                    lastPart = lastPart + firstPart;
                    less--;
                }
                lastPart = lastPart * minutes;
                System.out.println(lastPart);
            } catch (Exception e) {
                System.out.println("Oops");
            }
        }

    }

    public static void main(String[] args) {
        WastingTime storage = new WastingTime();
        storage.information();
    }
    
    //public static boolean flag = true;
    /*
        String data1, data2;
        Scanner reader = new Scanner(System.in);
        while (flag == true) {
            long minutes = 0, change = 0, firstPart = 0, lastPart = 0;
            data1 = reader.nextLine();
            if (data1.equals("-1 -1")) {
                flag = false;
                break;
            }
            data2 = reader.nextLine();
            String info[] = data1.split(" ");
            String chapers[] = data2.split(" ");
            minutes = Integer.parseInt(info[1]);
            for (int i = 0; i < chapers.length; i++) {
                change = Integer.parseInt(chapers[i]);
                firstPart += change;
                lastPart = lastPart + firstPart;
            }
            lastPart = lastPart * minutes;
            System.out.println(lastPart);
        }
     */
}
