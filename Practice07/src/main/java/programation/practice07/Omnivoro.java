package programation.practice07;

public abstract class Omnivoro extends Animal {

    public Omnivoro(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
        return especie;
    }

}
