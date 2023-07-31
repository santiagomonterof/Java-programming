package programation.practice07;

public abstract class Carnivoro extends Animal {

    public Carnivoro(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
        return especie;
    }

}
