package Second;

import java.util.Scanner;

public class Consola {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Insert your numbers");
        System.out.println("Example = 2 4 1 5 3");
        String data = reader.nextLine();
        String numbers[] = data.split(" ");

        Estadistica action = new Estadistica(numbers);

        while (true) {
            action.options();
            System.out.println("Choose your option");
            int option = reader.nextInt();
            switch (option) {
                case 1:
                    System.out.println("---");
                    System.out.println(action.minNumber());
                    System.out.println("---");
                    break;
                case 2:
                    System.out.println("---");
                    System.out.println(action.maxNumber());
                    System.out.println("---");
                    break;
                case 3:
                    System.out.println("---");
                    System.out.println(action.avarage());
                    System.out.println("---");
                    break;

            }
        }

    }
}
