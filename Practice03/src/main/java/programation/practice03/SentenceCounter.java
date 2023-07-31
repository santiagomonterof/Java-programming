package programation.practice03;

public class SentenceCounter {

    private String sentence;

    public SentenceCounter(String sentence) {
        this.sentence = sentence;
    }

    public int countWords() {
        String auxiliar[] = sentence.split(" ");
        int counter = auxiliar.length;
        if (sentence.equals("")) {
            counter--;
        }
        return counter;
    }

    public int countVowels() {
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            String auxiliar = sentence.substring(i, i + 1);
            auxiliar = auxiliar.toLowerCase();
            if (auxiliar.equals("a") || auxiliar.equals("e") || auxiliar.equals("i") || auxiliar.equals("o") || auxiliar.equals("u")) {
                counter++;
            }
        }
        return counter;
    }

    public int countSpace() {
        int counter = (countWords() - 1);
        if (sentence.equals("")) {
            counter++;
        }
        return counter;
    }

    public int countUppercase() {
        int counter = 0;
        String auxiliar = sentence.replaceAll(" ", "");
        for (int i = 0; i < auxiliar.length(); i++) {
            String auxiliar1 = auxiliar.substring(i, i + 1);
            String auxiliar2 = auxiliar1.toUpperCase();
            if (auxiliar1.equals(auxiliar2)) {
                counter++;
            }
        }
        return counter;
    }

    public int countLowercase() {
        int counter = 0;
        String auxiliar = sentence.replaceAll(" ", "");
        for (int i = 0; i < auxiliar.length(); i++) {
            String auxiliar1 = auxiliar.substring(i, i + 1);
            String auxiliar2 = auxiliar1.toLowerCase();
            if (auxiliar1.equals(auxiliar2)) {
                counter++;
            }
        }
        return counter;
    }

    public String capitalLetter() {
        if (sentence.length() == 0) {
            return sentence;
        } else {
            return sentence.substring(0, 1).toUpperCase() + sentence.substring(1).toLowerCase();
        }

    }

   
    
}
