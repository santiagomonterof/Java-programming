package programation.personal00;

public abstract class Sword extends Item {

    private int peso;

    public Sword(String name, int damage, int peso) {
        super(name, damage);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    
}
