package programation.practice02;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        String numbers[] = new String[10];                 //Cantidad de bloques predefinida
        System.out.println("Insert your list of numbers");
        System.out.println("like this: 1 2 3 4 5");
        Scanner reader = new Scanner(System.in);
        String data = reader.nextLine();
        String[] auxiliar = data.split(" ");
        
        for (int i = 0; i < auxiliar.length; i++) {
            numbers[i] = auxiliar[i];
        }
        
        Statistics info = new Statistics(numbers);         //Comprobación de que se puede añadir un numero extra
        System.out.println("Add an extra number");
        int extra = reader.nextInt();               
        System.out.println(info.addNumbers(extra));        //Mensaje de si se pudo añadir o no
        System.out.println(info.minNumber());              //Valor mínimo
        System.out.println(info.maxNumber());              //Valor máximo
        System.out.println(info.avarage());                //Promedio
        //System.out.println(info.seeList());              //Extra: Para poder ver los espacios vacios y llenos del array
        

    }
}
