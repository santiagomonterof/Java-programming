package Measurement;

import java.util.Scanner;

public class Console {

    Scanner reader = new Scanner(System.in);
    public int capacityBottle1 = 0, capacityBottle2 = 0;

    public String options[] = {"Fill bottle of water", "Throw water of Battle", ""
        + "Insert Bottle 1 In The Bottle 2", "Insert Bottle 2 In The Bottle 1", "Exit the problem"};

    public void options() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ".- " + options[i]);
        }
    }

    public void fillWater() {
        boolean flag1 = false;
        System.out.println("Which Bottle?");
        System.out.println("1.- 5 Liters");
        System.out.println("2.- 3 Liters");
        while (!flag1) {
            try {
                int option = Integer.parseInt(reader.nextLine());
                switch (option) {
                    case 1:
                        if (capacityBottle1 == 5) {
                            System.out.println("This bottle is alredy full");
                        } else {
                            capacityBottle1 = 5;
                            flag1 = true;
                        }
                        break;
                    case 2:
                        if (capacityBottle2 == 3) {
                            System.out.println("This bottle is alredy full");
                        } else {
                            capacityBottle2 = 3;
                            flag1 = true;
                        }
                        break;
                    default:
                        System.out.println("Insert a valid position");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Insert an integer number");
            }
        }
    }

    public void throwWater() {
        boolean flag2 = false;
        System.out.println("Which Bottle?");
        System.out.println("1.- 5 Liters");
        System.out.println("2.- 3 Liters");
        while (!flag2) {
            try {
                int option = Integer.parseInt(reader.nextLine());
                switch (option) {
                    case 1:
                        if (capacityBottle1 == 0) {
                            System.out.println("This bottle is alredy empty");
                        } else {
                            capacityBottle1 = 0;
                            flag2 = true;
                        }
                        break;
                    case 2:
                        if (capacityBottle2 == 0) {
                            System.out.println("This bottle is alredy empty");
                        } else {
                            capacityBottle2 = 0;
                            flag2 = true;
                        }
                        break;
                    default:
                        System.out.println("Insert a valid position");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Insert an integer number");
            }
        }
    }

    public void status() {
        if (capacityBottle1 == 0) {
            System.out.println("----------");
            System.out.println("|        |--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 1   ");
            System.out.println("|        |              CAPACITY 5LTS");
            System.out.println("|        |              EMPTY 0/5");
            System.out.println("----------");
        }
        if (capacityBottle1 == 1) {
            System.out.println("----------");
            System.out.println("|        |--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 1   ");
            System.out.println("|        |              CAPACITY 5LTS");
            System.out.println("|~~~~~~~~|              1/5 Lts.");
            System.out.println("----------");
        }
        if (capacityBottle1 == 2) {
            System.out.println("----------");
            System.out.println("|        |--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 1   ");
            System.out.println("|~~~~~~~~|              CAPACITY 5LTS");
            System.out.println("|        |              2/5 Lts.");
            System.out.println("----------");
        }
        if (capacityBottle1 == 3) {
            System.out.println("----------");
            System.out.println("|        |--");
            System.out.println("|        | |");
            System.out.println("|~~~~~~~~|--            BOTTLE 1   ");
            System.out.println("|        |              CAPACITY 5LTS");
            System.out.println("|        |              3/5 Lts.");
            System.out.println("----------");
        }
        if (capacityBottle1 == 4) {
            System.out.println("----------");
            System.out.println("|        |--");
            System.out.println("|~~~~~~~~| |");
            System.out.println("|        |--            BOTTLE 1   ");
            System.out.println("|        |              CAPACITY 5LTS");
            System.out.println("|        |              4/5 Lts.");
            System.out.println("----------");
        }
        if (capacityBottle1 == 5) {
            System.out.println("----------");
            System.out.println("|~~~~~~~~|--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 1   ");
            System.out.println("|        |              CAPACITY 5LTS");
            System.out.println("|        |              FULL 5/5");
            System.out.println("----------");
        }
        if (capacityBottle2 == 0) {
            System.out.println(" -=[++]=-");
            System.out.println("|--------|--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 2   ");
            System.out.println("|        |              CAPACITY 3LTS");
            System.out.println("|--------|              EMPTY 0/3");

        }
        if (capacityBottle2 == 1) {
            System.out.println(" -=[++]=-");
            System.out.println("|--------|--");
            System.out.println("|        | |");
            System.out.println("|        |--            BOTTLE 2   ");
            System.out.println("|~~~~~~~~|              CAPACITY 3LTS");
            System.out.println("|--------|              1/3 Lts.");

        }
        if (capacityBottle2 == 2) {
            System.out.println(" -=[++]=-");
            System.out.println("|--------|--");
            System.out.println("|        | |");
            System.out.println("|~~~~~~~~|--            BOTTLE 2   ");
            System.out.println("|        |              CAPACITY 3LTS");
            System.out.println("|--------|              2/3 Lts.");

        }
        if (capacityBottle2 == 3) {
            System.out.println(" -=[++]=-");
            System.out.println("|--------|--");
            System.out.println("|~~~~~~~~| |");
            System.out.println("|        |--            BOTTLE 2   ");
            System.out.println("|        |              CAPACITY 3LTS");
            System.out.println("|--------|              FULL 3/3");

        }
    }

    public void insertBottle1InTheBottle2() {
        if (capacityBottle1 == 0 || capacityBottle2 == 3) {
            System.out.println("-------------------------------------");
            System.out.println("Bottle empty or full for the transfer");
            System.out.println("-------------------------------------");
        } else {
            for (int i = 0; i < 3; i++) {
                capacityBottle2++;
                capacityBottle1--;
                if (capacityBottle1 == 0 || capacityBottle2 == 3) {
                    break;
                }
            }
        }
    }

    public void insertBottle2InTheBottle1() {
        if (capacityBottle2 == 0 || capacityBottle1 == 5) {
            System.out.println("-------------------------------------");
            System.out.println("Bottle empty or full for the transfer");
            System.out.println("-------------------------------------");

        } else {
            for (int i = 0; i < 5; i++) {
                capacityBottle2--;
                capacityBottle1++;
                if (capacityBottle2 == 0 || capacityBottle1 == 5) {
                    break;
                }
            }
        }

    }
}
/*if (capacityBottle1 > 3) {
                capacityBottle2 = 3;
                capacityBottle1 = capacityBottle1 - 3;
            }
            if (capacityBottle1 <= 3 && capacityBottle2 == 0) {
                capacityBottle2 = capacityBottle1;
                capacityBottle1 = 0;
            }
            if (capacityBottle2 > 0 && capacityBottle2 < 3) {
                capacityBottle2 = 3;
                capacityBottle1 = capacityBottle2 - 1;

            }
 */
 /*if (capacityBottle1 == 0) {
            System.out.println("The bottle 1 is empty");
        } else {
            if (capacityBottle2 > 0) {
                capacityBottle2 = capacityBottle1 - capacityBottle2;
                capacityBottle1 = 4;

            } else {
                if (capacityBottle1 > filler2) {
                    capacityBottle1 = filler1 - filler2;
                    capacityBottle2 = filler2;
                } else {

                    capacityBottle2 = capacityBottle1;
                    capacityBottle1 = 0;

                }
            }
        }*/
