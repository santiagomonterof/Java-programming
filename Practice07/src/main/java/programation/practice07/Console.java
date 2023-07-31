package programation.practice07;

public class Console {

    public static void main(String[] args) {
        Animal conejo = new Conejo("Conejo");
        Animal leon = new Leon("Leon");
        System.out.println(conejo.getInfo());
        System.out.println(leon.getInfo());

    }
}
