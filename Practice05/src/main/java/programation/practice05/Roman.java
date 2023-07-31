package programation.practice05;

import java.util.Scanner;

public class Roman {

    public static String changeNumber(int number) {
        int thousands, hundreds, tens, units;
        String roman = "";

        thousands = number / 1000;
        hundreds = number / 100 % 10;
        tens = number / 10 % 10;
        units = number % 10;
       
        for (int i = 1; i <= thousands; i++) {
            roman = roman + "M";
        }

        if (hundreds == 9) {
            roman = roman + "CM";
        } else if (hundreds >= 5) {
            roman = roman + "D";
            for (int i = 6; i <= hundreds; i++) {
                roman = roman + "C";
            }
        } else if (hundreds == 4) {
            roman = roman + "CD";
        } else {
            for (int i = 1; i <= hundreds; i++) {
                roman = roman + "C";
            }
        }

        if (tens == 9) {
            roman = roman + "XC";
        } else if (tens >= 5) {
            roman = roman + "L";
            for (int i = 6; i <= tens; i++) {
                roman = roman + "X";
            }
        } else if (tens == 4) {
            roman = roman + "XL";
        } else {
            for (int i = 1; i <= tens; i++) {
                roman = roman + "X";
            }
        }

        if (units == 9) {
            roman = roman + "IX";
        } else if (units >= 5) {
            roman = roman + "V";
            for (int i = 6; i <= units; i++) {
                roman = roman + "I";
            }
        } else if (units == 4) {
            roman = roman + "IV";
        } else {
            for (int i = 1; i <= units; i++) {
                roman = roman + "I";
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        do {            
            System.out.println("Insert a number between 1 to 3500: ");
            number = reader.nextInt();
        } while (number < 1 || number > 3500);        
        System.out.println(number + " == " + changeNumber(number));
    }
}
