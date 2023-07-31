package programation.practice03;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sentence = reader.nextLine();
        SentenceCounter data = new SentenceCounter(sentence);
        System.out.println(data.countWords());
        System.out.println(data.countVowels());
        System.out.println(data.countSpace());
        System.out.println(data.countUppercase());
        System.out.println(data.countLowercase());
        System.out.println(data.capitalLetter());               
    }
}
