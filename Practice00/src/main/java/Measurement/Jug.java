package Measurement;

import java.util.Scanner;

public class Jug {

    public static void main(String[] args) {

        boolean flag1 = false;
        Console functions = new Console();
        Scanner reader = new Scanner(System.in);
        System.out.println("                                        WELCOME");
        System.out.println("You have a 5-liter bottle and a 3-liter bottle. How can you get to measure 4 liters?");

        while (!flag1) {
            try {
                functions.status();
                if (functions.capacityBottle1 == 4 || functions.capacityBottle2 == 4) {
                    System.out.println("---------------");
                    System.out.println("Master in logic");
                    System.out.println("---------------");
                    flag1 = true;
                    break;
                }
                System.out.println("");
                functions.options();
                String auxiliar = reader.nextLine();
                int option = Integer.parseInt(auxiliar);
                switch (option) {
                    case 1:
                        if (functions.capacityBottle1 == 5 && functions.capacityBottle2 == 3) {
                            System.out.println("---------------------");
                            System.out.println("Both bottles are full");
                            System.out.println("---------------------");
                        } else {
                            functions.fillWater();
                        }
                        break;
                    case 2:
                        if (functions.capacityBottle1 == 0 && functions.capacityBottle2 == 0) {
                            System.out.println("---------------------");
                            System.out.println("Both bottles are empty");
                            System.out.println("---------------------");
                        } else {
                            functions.throwWater();
                        }
                        break;
                    case 3:
                        functions.insertBottle1InTheBottle2();
                        break;
                    case 4:
                        functions.insertBottle2InTheBottle1();
                        break;
                    case 5:
                        flag1 = true;
                        break;
                    default:
                        System.out.println("---------------------");
                        System.out.println("Insert a valid number");
                        System.out.println("---------------------");
                        break;
                }
            } catch (Exception e) {
                System.out.println("-----------------------");
                System.out.println("Insert a integer number");
                System.out.println("-----------------------");
            }
        }
    }
}
