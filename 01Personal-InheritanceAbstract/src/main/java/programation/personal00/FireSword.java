package programation.personal00;

public class FireSword extends Sword {

    public FireSword(String name, int damage, int peso) {
        super(name, damage, peso);
    }

    @Override
    public int use(int health) {
        int fire = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println("-5 " + " Auch");
            System.out.println(health = health - fire);
        }
        return health;
    }
    

}
