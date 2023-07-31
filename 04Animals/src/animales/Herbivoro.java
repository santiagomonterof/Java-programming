package animales;

public abstract class Herbivoro extends Animal {

    public Herbivoro(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "es un Herbivoro que " ;
    }
}
