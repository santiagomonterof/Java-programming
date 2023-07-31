package programation.personal00;

public class Console {

    public static void main(String[] args) {

        Person Santiago = new Person("Santiago", 100);
        Sword EspadaFuego = new FireSword("OnFire", 20, 50);
        Santiago.saveItem(EspadaFuego);
        System.out.println(Santiago.use(0));

        
    }
}
