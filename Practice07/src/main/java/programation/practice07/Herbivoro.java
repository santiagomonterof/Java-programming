package programation.practice07;

public abstract class Herbivoro extends Animal {

    public Herbivoro(String especie) {
        super(especie);
    }

    @Override
    public String getInfo() {
       especie += " herbivoro que ";
        return especie;
    }

}
